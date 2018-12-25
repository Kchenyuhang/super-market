package com.soft1841.sm.controller;
/**
 * 商品种类控制台
 * @auther柳磊磊
 * 2018 12.25
 */


import cn.hutool.db.Entity;

import com.soft1841.sm.dao.TypeDAO;
import com.soft1841.sm.entity.ComponentUtil;
import com.soft1841.sm.entity.Type;
import com.soft1841.sm.until.DAOFactory;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class TypeController implements Initializable {
    @FXML
    private TableView<Type> typeTable;
    private ObservableList<Type> typeData = FXCollections.observableArrayList();
    private TypeDAO typeDAO = DAOFactory.getTypeDAOInstance();
    private List<Entity> entityList = null;
    private TableColumn<Type, Type> delCol = new TableColumn<>("操作");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        typeTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        delCol.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        delCol.setCellFactory(param -> new TableCell<Type, Type>() {
            private final Button deleteButton = ComponentUtil.getButton("删除", "warning-theme");
            @Override
            protected void updateItem(Type type, boolean empty) {
                super.updateItem(type, empty);
                if (type == null) {
                    setGraphic(null);
                    return;
                }
                setGraphic(deleteButton);
                deleteButton.setOnAction(event -> {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("确认对话框");
                    alert.setHeaderText("请确认");
                    alert.setContentText("确定要删除这行记录吗?");
                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.get() == ButtonType.OK){
                        typeData.remove(type);
                        try {
                            typeDAO.deleteTypeById(type.getId());
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        typeTable.getColumns().add(delCol);
        try {
            entityList = typeDAO.selectAllTypes();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        showTypeData(entityList);
    }

    public void addType() {
        TextInputDialog dialog = new TextInputDialog("新类别");
        dialog.setTitle("食品类别");
        dialog.setHeaderText("新增商品类别");
        dialog.setContentText("请输入商品类别名称:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            //获得输入的内容
            String typeName = result.get();
            //创建一个Type对象，插入数据库，并返回主键
            Type type = new Type();
            type.setTypeName(typeName);
            long id = 0;
            try {
                id = typeDAO.insertType(type);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            type.setId(id);
            typeData.add(type);

        }
    }

    private void showTypeData(List<Entity> entityList) {
        for (Entity entity : entityList) {
            Type type = new Type();
            type.setId(entity.getInt("id"));
            type.setTypeName(entity.getStr("type_name"));
            typeData.add(type);
        }
        typeTable.setItems(typeData);
    }

}
