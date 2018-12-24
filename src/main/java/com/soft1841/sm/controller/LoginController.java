package com.soft1841.sm.controller;

import com.soft1841.sm.service.CashierService;
import com.soft1841.sm.until.ServiceFactory;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class LoginController {
    @FXML
    private TextField accountField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ToggleGroup user;

    private CashierService cashierService = ServiceFactory.getCashierServiceInstance();


}
