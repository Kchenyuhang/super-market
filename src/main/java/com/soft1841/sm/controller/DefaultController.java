package com.soft1841.sm.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DefaultController implements Initializable {
    @FXML
    private ImageView bookImg;
    String[] imgPath = {"k1.png","k2.png","k3.png","k4.png","k5.png"};
    @Override
    public void initialize(URL location, ResourceBundle resources) {
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
