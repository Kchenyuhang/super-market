package com.soft1841.sm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class LoginApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle ( "星辰超市登录界面" );
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource("/fxml/login.fxml"));
        Parent root = fxmlLoader.load ();
        Scene scene = new Scene ( root,650,550 );
        scene.getStylesheets ().addAll ("/css/login.css");
        primaryStage.getIcons ().add ( new Image ( "/img/star.png" ) );
        primaryStage.setScene ( scene );
        primaryStage.show ();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
