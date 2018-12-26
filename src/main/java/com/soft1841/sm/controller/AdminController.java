package com.soft1841.sm.controller;

import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.service.AdminService;
import com.soft1841.sm.until.ServiceFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * 管理员管理控制器
 * @author 陈宇航
 * 2018.12.26
 */
public class AdminController implements Initializable {
    @FXML
    private ListView<Admin> adminListView;

    private AdminService adminService = ServiceFactory.getAdminServiceInstance();

    private ObservableList<Admin> observableList = FXCollections.observableArrayList();

    private List<Admin> adminList = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        adminList = adminService.getAllAdmins();
        observableList.setAll(adminList);
        adminListView.setItems(observableList);
        adminListView.setCellFactory(new Callback<ListView<Admin>, ListCell<Admin>>() {
            @Override
            public ListCell<Admin> call(ListView<Admin> param) {
                return new ListCell<Admin>() {
                    @Override
                    public void updateItem(Admin item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null && !empty) {
                            HBox container = new HBox();
                            container.setSpacing(20);
                            container.getStyleClass().add("box");
                            container.setMouseTransparent(true);
                            ImageView imageView = new ImageView(new Image(item.getPicture()));
                            imageView.setFitHeight(100);
                            imageView.setFitWidth(100);
                            Label accountLabel = new Label(item.getAccount());
                            Label nameLable = new Label(item.getName());
                            Label sexLable = new Label(item.getSexuality());
                            container.getChildren().addAll(imageView,accountLabel,nameLable,sexLable);
                            setGraphic(container);
                        }
                    }
                };
            }
        });
    }
}
