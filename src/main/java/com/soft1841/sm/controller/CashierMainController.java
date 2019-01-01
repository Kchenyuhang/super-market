package com.soft1841.sm.controller;

import com.soft1841.sm.entity.Goods;
import com.soft1841.sm.entity.Type;
import com.soft1841.sm.service.GoodsService;
import com.soft1841.sm.service.TypeService;
import com.soft1841.sm.until.ServiceFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CashierMainController implements Initializable {
    @FXML
    private TableView<Goods> goodTable;
    @FXML
    private TextField barcodeField;
    private ObservableList<Type> typeData = FXCollections.observableArrayList();
    private TypeService typeService = ServiceFactory.getTypeServiceInstance();
    private ObservableList<Goods> goodsData = FXCollections.observableArrayList();
    private GoodsService goodsService = ServiceFactory.getGoodsServiceInstance();
    private List<Goods> goodsList = null;
    @FXML
    private javafx.scene.control.Button closeButton;
    @FXML
    private void closeButtonAction(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        iniTable();
    }

    private void iniTable() {
        goodTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }

    private void showGoodsData(List<Goods> goodsList) {
        goodsData.addAll(goodsList);
        goodTable.setItems(goodsData);
    }

//    public void search(KeyEvent event){
//        double x = barcodeField.getLayoutX();
//        double y = barcodeField.getLayoutY();
//        KeyCode keyCode = event.getCode();
//        if (keyCode == KeyCode.ENTER){
//
//            String barcode = barcodeField.getText().trim();
//            goodsList=  goodsService.getGoodsByBarcode(Long.parseLong(barcode));
//            showGoodsData(goodsList);
//
//        }
//    }
}
