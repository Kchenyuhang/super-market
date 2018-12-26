package com.soft1841.sm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * 主控制器
 * @author 陈宇航
 * 2018.12.25
 */
public class AdminMainController implements Initializable {
    @FXML
    private StackPane mainContainer;
    @FXML
    private javafx.scene.control.Button closeButton;
    @FXML
    private void closeButtonAction(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    //显示默认主页数据
    public void listDefault() throws Exception {
        switchView("default.fxml");
    }

    //显示商品类别数据
    public void listType() throws Exception {
        switchView("type.fxml");
    }
    public void listGoods() throws Exception {

        switchView("goods.fxml");

    }

    public void listGoodsAnalysis() throws Exception {

        switchView("goods_analysis.fxml");

    }



    private void switchView(String fileName) throws Exception {
        //清空原有内容
        mainContainer.getChildren().clear();
        AnchorPane anchorPane = new FXMLLoader(getClass().getResource("/fxml/" + fileName)).load();
        mainContainer.getChildren().add(anchorPane);
    }
}