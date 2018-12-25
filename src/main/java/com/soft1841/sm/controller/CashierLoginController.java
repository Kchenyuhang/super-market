package com.soft1841.sm.controller;

import com.soft1841.sm.service.CashierService;
import com.soft1841.sm.until.ServiceFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 收银登录控制器
 * @author 陈宇航
 * 2018.12.25
 */
public class CashierLoginController {
    @FXML
    private TextField accountField1;
    @FXML
    private PasswordField passwordField1;

    private CashierService cashierService = ServiceFactory.getCashierServiceInstance();

    /**
     * 登录方法
     * @throws Exception
     */
    public void login() throws Exception {
        String account1 = accountField1.getText().trim();
        String password1 = passwordField1.getText().trim();
        //调用service的登录功能
        boolean flag = cashierService.login(account1,password1);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("提示");
        if (flag) {
            alert.setContentText("登陆成功！");
            alert.showAndWait();
            //登陆成功后跳转到收银界面
            Stage cashierStage = new Stage();
            //读入布局文件
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/cashier.fxml"));
            AnchorPane root = fxmlLoader.load();
            Scene scene = new Scene(root);
            //读入样式
            scene.getStylesheets().add("/css/cashier.css");
            cashierStage.setTitle("收银系统");
            cashierStage.setMaximized(true);
            cashierStage.setScene(scene);
            cashierStage.show();
            Stage loginStage = (Stage) accountField1.getScene().getWindow();
            loginStage.close();
        } else {
            alert.setContentText("账号或密码错误，登录失败！");
            alert.showAndWait();
        }
    }
}