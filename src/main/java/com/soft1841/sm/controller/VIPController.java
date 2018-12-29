package com.soft1841.sm.controller;

import com.soft1841.sm.entity.VIP;
import com.soft1841.sm.service.VIPService;
import com.soft1841.sm.until.ServiceFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javax.swing.text.TabableView;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * 会员信息控制器
 * @author 高金通
 * 2018.12.27
 */
public class VIPController implements Initializable {
    @FXML
    private FlowPane vipPane;
    private VIPService vipService = ServiceFactory.getVIPServiceInstance();
    private List<VIP> vipList = new ArrayList<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        vipList = vipService.getAllVIP();
        showVIP(vipList);
    }

    //通过遍历循环vipList集合，创建Hbox来显示每个会员信息
    private void showVIP(List<VIP> vipList) {
        //移除之前的记录
        vipPane.getChildren().clear();
        for (VIP vip : vipList) {
            VBox rightBox = new VBox();
            rightBox.getStyleClass().add("box");
            rightBox.setSpacing(10);
            Label nameLabel = new Label(vip.getName());
            nameLabel.getStyleClass().add("font-title");
            Label phoneLabel = new Label(vip.getPhone());
            Label provinceLabel = new Label(vip.getProvince());
            Label numberLabel = new Label(vip.getNumber());
            Button delBtn = new Button("删除");
            delBtn.getStyleClass().add("warning-theme");
            //水平布局加入大的内容容器
            vipPane.getChildren().add(rightBox);
            //删除按钮事件
            delBtn.setOnAction(event -> {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("确认对话框");
                alert.setContentText("亲~！确定要删除这行记录吗？");
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.OK) {
                    long id = vip.getId();
                    //删除这行记录
                    vipService.deleteVIP(id);
                    //从流式面板移除当前这个人的布局
                    vipPane.getChildren().remove(rightBox);
                }
            });
            rightBox.getChildren().addAll(nameLabel,phoneLabel,provinceLabel,numberLabel,delBtn);
        }
    }
    //新增会员方法
    public void insertVIP() {
        //创建一个VIP对象
        VIP vip = new VIP();
        //新建一个舞台
        Stage stage = new Stage();
        stage.setTitle("新增会员界面");
        //创建一个处置布局，用来放新增会员的各个组件
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10,10,10,10));
        Label infoLabel = new Label("请输入会员信息");
        infoLabel.setPrefHeight(50);
        infoLabel.setPrefWidth(580);
        infoLabel.setAlignment(Pos.CENTER);
        //给文本添加样式
        infoLabel.getStyleClass().addAll("blue-theme","font-title");
        TextField nameField = new TextField();
        nameField.setPromptText("请输入姓名");
        //输入框无焦点
        nameField.setFocusTraversable(true);
        TextField pictureField = new TextField();

        //电话输入框
        TextField phoneField = new TextField();
        phoneField.setPromptText("请输入电话");
        phoneField.setFocusTraversable(true);
        //省份输入框
        TextField provinceField = new TextField();
        provinceField.setPromptText("请输入省份");
        provinceField.setFocusTraversable(true);
        //积分输入框
        TextField numberField = new TextField();
        provinceField.setPromptText("请输入积分");
        provinceField.setFocusTraversable(true);
        //新增按钮
        FlowPane flowPane = new FlowPane();
        Button insertBtn = new Button("新增");
        provinceField.setFocusTraversable(true);
        insertBtn.setPrefWidth(110);
        insertBtn.getStyleClass().addAll("green-theme","btn-radius");
        flowPane.getChildren().add(insertBtn);
        flowPane.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(infoLabel,nameField,phoneField,provinceField,numberField);
        Scene scene = new Scene(vBox,450,300);
        scene.getStylesheets().add("/css/style.css");
        stage.getIcons().add(new Image("/img/star.png"));
        stage.setScene(scene);
        stage.show();
        //点击新增按钮，将界面数据封装成一个VIP对象，写入数据库
        insertBtn.setOnAction(event -> {
            String nameString = nameField.getText().trim();
            String phoneString = phoneField.getText().trim();
            String provinceString = provinceField.getText().trim();
            String numberString = numberField.getText().trim();
            vip.setProvince(provinceString);
            vip.setPhone(phoneString);
            vip.setName(nameString);
            vip.setNumber(numberString);
            System.out.println(vip.getPhone() + vip.getName() + vip.getProvince() + vip.getNumber());
            vipService.addVIP(vip);
            stage.close();
            //重新读取一下数据显示
            vipList = vipService.getAllVIP();
            showVIP(vipList);
        });
    }
}
