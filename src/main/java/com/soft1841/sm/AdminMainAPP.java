package com.soft1841.sm;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * 后台主界面App
 * @author 陈宇航
 * 2018.12.25
 */
public class AdminMainAPP extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("星辰超市后台系统");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/admins.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        primaryStage.setMaximized(true);
        scene.getStylesheets().add(AdminMainAPP.class.getResource("/css/manage.css").toExternalForm());
        primaryStage.getIcons().add(new Image("/img/star.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
