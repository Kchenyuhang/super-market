package com.soft1841.sm.controller;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

/**
 * 主控制器
 * @author 小组成员
 * 2018.12.25
 */
public class AdminMainController implements Initializable {
    @FXML
    private StackPane mainContainer;
    @FXML
    private javafx.scene.control.Button closeButton;

    @FXML
    private void closeButtonAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private Button a;
    @FXML
    private Button b;
    @FXML
    private Button c;
    @FXML
    private Button d;
    @FXML
    private Button e;
    @FXML
    private Button f;
    @FXML
    private Button g;
    @FXML
    private Button h;
    @FXML
    private Button i;
    @FXML
    private Label timeLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Image btnImg = new Image("/img/leibie.png");
        ImageView imageView = new ImageView(btnImg); //给按钮设置图标
        a.setGraphic(imageView);
        Image btnImg1 = new Image("/img/xinxi.png");
        ImageView imageView1 = new ImageView(btnImg1); //给按钮设置图标
        b.setGraphic(imageView1);
        Image btnImg2 = new Image("/img/people2.png");
        ImageView imageView2 = new ImageView(btnImg2); //给按钮设置图标
        c.setGraphic(imageView2);
        Image btnImg3 = new Image("/img/shouyin2.png");
        ImageView imageView3 = new ImageView(btnImg3); //给按钮设置图标
        d.setGraphic(imageView3);
        Image btnImg4 = new Image("/img/tong_ji.png");
        ImageView imageView4 = new ImageView(btnImg4); //给按钮设置图标
        e.setGraphic(imageView4);
        Image btnImg5 = new Image("/img/xiaoshou.png");
        ImageView imageView5 = new ImageView(btnImg5); //给按钮设置图标
        f.setGraphic(imageView5);
        Image btnImg6 = new Image("/img/xitong.png");
        ImageView imageView6 = new ImageView(btnImg6); //给按钮设置图标
        g.setGraphic(imageView6);
        Image btnImg7 = new Image("/img/shujujiazaishibai.png");
        ImageView imageView7 = new ImageView(btnImg7); //给按钮设置图标
        h.setGraphic(imageView7);
        Image btnImg8 = new Image("/img/main.png");
        ImageView imageView8 = new ImageView(btnImg8); //给按钮设置图标
        i.setGraphic(imageView8);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH：mm:ss");
                    String timeString = dateTimeFormatter.format(now);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            timeLabel.setText(timeString);
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e1) {
                        System.err.println("中断异常");
                    }
                }
            }
        }).start();
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

    public void listCashier() throws Exception {
        switchView("shouyin.fxml");
    }

    public void listCashierAnalysis() throws Exception {
        switchView("shouyin_analysis.fxml");
    }

    public void listGoodsAnalysis() throws Exception {

        switchView("goods_analysis.fxml");

    }

    public void listVIP() throws Exception {
        switchView("vip.fxml");
    }


    private void switchView(String fileName) throws Exception {
        //清空原有内容
        ObservableList<Node> list = mainContainer.getChildren();
        mainContainer.getChildren().removeAll(list);
        AnchorPane anchorPane = new FXMLLoader(getClass().getResource("/fxml/" + fileName)).load();
        mainContainer.getChildren().add(anchorPane);
    }

    public void listtype_Analysis() throws Exception {
        switchView("type_analysis.fxml");
    }

    public void playVoice() throws Exception {
        InputStream in = new FileInputStream("D:\\shixun\\super-market\\src\\main\\resources\\img\\GEM.wav");
        AudioStream as = new AudioStream(in);
        AudioPlayer.player.start(as);
    }
}