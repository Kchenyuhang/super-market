package com.soft1841.sm.controller;

import com.soft1841.sm.service.AnalysisService;
import com.soft1841.sm.until.ServiceFactory;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DefaultController implements Initializable {
    @FXML
    private ImageView bookImg;
    String[] imgPath = {"k1.png","k2.png","k3.png","k4.png","k5.png"};
    @FXML

    private Label typeCount, goodsCount;

    private AnalysisService analysisService = ServiceFactory.getAnalysisServiceInstance();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        typeCount.setText("类别"+analysisService.getTypesCount()+"种");

        goodsCount.setText("商品"+analysisService.getGoodsCount()+"个");
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    for (int i =0;i<imgPath.length;i++){
                        Image image = new Image("/img/"+ imgPath[i]);
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                bookImg.setImage(image);
                            }
                        });
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (i == imgPath.length - 1){
                            i =0;
                        }
                    }
                }
            }
        }).start();

    }
}
