package com.soft1841.sm.controller;

import com.soft1841.sm.service.CashierService;
import com.soft1841.sm.until.ServiceFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class LoginController {
    @FXML
    private TextField accountField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ToggleGroup user;

    private CashierService cashierService = ServiceFactory.getCashierServiceInstance();

    public void login() throws Exception {
        String account = accountField.getText().trim();
        String password = passwordField.getText().trim();
        //调用service的登录功能
        boolean flag = cashierService.login(account,password);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("提示");
        if (flag) {
            alert.setContentText("登陆成功！");
            alert.showAndWait();
        } else {
            alert.setContentText("账号或密码错误，登录失败！");
            alert.showAndWait();
        }
    }
}
