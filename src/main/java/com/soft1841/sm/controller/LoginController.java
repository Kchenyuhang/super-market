package com.soft1841.sm.controller;

import com.soft1841.sm.service.CashierService;
import com.soft1841.sm.until.ServiceFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class LoginController {
    @FXML
    private TextField accountField;
    @FXML
    private PasswordField passwordField;

    private CashierService cashierService = ServiceFactory.getCashierServiceInstance();

    public void login() throws IOException {
        String account = accountField.getText().trim();
        String password = passwordField.getText().trim();
        //调用service的登录功能
        boolean flag = cashierService.login(account,password);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("提示");
        if (flag) {
            alert.setContentText("登陆成功！");
            alert.showAndWait();
            //登陆成功后跳转到商品管理界面
            Stage managerStage = new Stage();
            //读入布局文件
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/manage.fxml"));
            BorderPane root = fxmlLoader.load();
            Scene scene = new Scene(root);
            //读入样式
            scene.getStylesheets().add("/css/manage.css");
            managerStage.setTitle("goods manage system");
            managerStage.setMaximized(true);
            managerStage.setScene(scene);
            managerStage.show();
            Stage loginStage = (Stage) accountField.getScene().getWindow();
            loginStage.close();


        } else {
            alert.setContentText("账号或密码错误，登录失败！");
            alert.showAndWait();
        }
    }
}
