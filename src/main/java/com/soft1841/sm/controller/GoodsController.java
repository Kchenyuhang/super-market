package com.soft1841.sm.controller;
/**
 * 商品信息管理控制器
 * @author 汤萌慧
 * 2018.12.26
 */

import com.soft1841.sm.entity.ComponentUtil;
import com.soft1841.sm.entity.Goods;
import com.soft1841.sm.entity.Type;
import com.soft1841.sm.service.GoodsService;
import com.soft1841.sm.service.TypeService;
import com.soft1841.sm.until.ComPonentutil;
import com.soft1841.sm.until.ExcelExport;
import com.soft1841.sm.until.ServiceFactory;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class GoodsController  implements Initializable{
    @FXML
    private FlowPane goodsPane;
    //布局文件中的下拉框组件对象，用来显示数据库中读取的所有商品种类
    @FXML
    private ComboBox<Type> typeComboBox;
    //布局文件中的输入文本框对象，用来输入搜索关键词
    @FXML
    private TextField keywordsField;
    //商品模型数据集合，可以实现相应数据的变化，无需刷新
    private ObservableList<Goods> goodsData = FXCollections.observableArrayList ();
    //商品类型模型数据集合
    private ObservableList<Type> typeData = FXCollections.observableArrayList ();
    //商品Service对象，从DAO工厂通过静态方法获得
    private GoodsService goodsService = ServiceFactory.getGoodsServiceInstance();
    //类别TypeService对象
    private TypeService typeService = ServiceFactory.getTypeServiceInstance();
    //商品集合，存放数据库商品表各种查询的结果
    private List<Goods> goodsList = null;
    //类别集合，存放数据库类别表查询结果
    private List<Type> typeList = null;

    //初始化方法，通过调用对商品表格和列表下拉框的两个封装方法，实现数据初始化
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        goodsList = goodsService.getAllGoods();
        showGoods (goodsList);
        initComBox();
    }
    //下拉框初始化方法
    private void initComBox() {
        //1.到数据库查询所有的类别
        typeList = typeService.getAllTypes();
        //2.将typeList集合加入typeData模型数据集合
        typeData.addAll(typeList);
        //3.将数据模型设置给下拉框
        typeComboBox.setItems(typeData);
        //4.下拉框选择事件监听，根据选择不同的类别，商品表格中会过滤出该类别的商品
        typeComboBox.getSelectionModel().selectedItemProperty().addListener((options, oldValue, newValue) -> {
                    // System.out.println(newValue.getId() + "," + newValue.getTypeName());
                    //移除掉之前的数据
                    goodsPane.getChildren().removeAll(goodsData);
                    //根据选中的类别查询该类别所有商品
                    goodsList = goodsService.getGoodsByTypeId(newValue.getId());
                    //重新显示数据
                    showGoods (goodsList);
                }
        );
    }
    private void showGoods(List<Goods> goodsList) {
        ObservableList<Node> observableList = goodsPane.getChildren();
        goodsPane.getChildren().removeAll(Collections.singleton(observableList));
        goodsPane.getChildren().clear();
        //通过循环遍历readerList集合，创建HBox来显示每个商品信息
        for (Goods goods : goodsList) {
            VBox vBox = new VBox();

            vBox.setPrefSize(320, 300);

            vBox.setSpacing(10);

            vBox.setPadding(new Insets(10, 10, 10, 10));

            vBox.getStyleClass().add("box");
            //创建左侧垂直布局
            VBox topBox = new VBox();
            topBox.setStyle("-fx-pref-width: 320;-fx-pref-height: 230");
            topBox.setSpacing(10);
            topBox.setAlignment(Pos.TOP_CENTER);
            //创建右侧垂直布局
            HBox bottomBox = new HBox();

            bottomBox.setStyle("-fx-pref-width: 320;-fx-pref-height: 30");

            bottomBox.setSpacing(10);

            bottomBox.setAlignment(Pos.BOTTOM_LEFT);
            //商品名
            TextField nameLabel = new TextField(goods.getName());
            nameLabel.getStyleClass().add("font-title");
            nameLabel.setEditable(false);
            //价格
            TextField priceLabel = new TextField("价格：" + goods.getPrice());
            priceLabel.getStyleClass().add("role-name");
            priceLabel.setEditable(false);
            //描述
            TextField descriptionLabel = new TextField("描述："+goods.getDescription());
            descriptionLabel.setEditable(false);
            //删除按钮
            Button delBtn = new Button("删除");
            delBtn.setOnAction(event -> {
                //弹出一个确认对话框
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("确认对话框");
                alert.setContentText("确定要删除此纪录吗？");
                //确认
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.OK) {
                    //得到id
                    long id = goods.getId();
                    goodsService.deleteGoods(id);
                    //从流式面板删除
                    goodsPane.getChildren().remove(vBox);
                }
            });
            //编辑按钮
            Button alterBtn = new Button("编辑");
            alterBtn.setOnAction(event -> {
                priceLabel.setEditable(true);
                priceLabel.getStyleClass().add("blue-theme");
                nameLabel.getStyleClass().add("blue-theme");
                nameLabel.setEditable(true);
            });
            //确认按钮
            Button yesBtn = new Button("确认");
            alterBtn.setOnAction(event -> {
            });
            //加入
            bottomBox.getChildren().addAll(alterBtn,delBtn,yesBtn);
            topBox.getChildren().addAll(nameLabel, descriptionLabel, priceLabel);
            //加入卡片
            vBox.getChildren().addAll(topBox, bottomBox);
            goodsPane.getChildren().add(vBox);
            vBox.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2) {
                    vBox.getChildren().clear();
                    ImageView avatarImg = new ImageView(new Image(goods.getPicture ()));
                    avatarImg.setFitWidth(150);
                    avatarImg.setFitHeight(150);
                    vBox.getChildren().addAll(avatarImg);
                    //再次双击返回
                    vBox.setOnMouseClicked(event1 -> {
                        if (event1.getClickCount() == 2) {
                            vBox.getChildren().clear();
                            vBox.getChildren().addAll(topBox,bottomBox);
                        }
                    });
                }
            });
        }
    }
    private void showGoodsData(List<Goods> goodsList) {
        goodsData.addAll(goodsList);
        goodsPane.getChildren().add((Node) goodsData);
    }
    //弹出新增商品界面方法
    public void newGoodsStage() throws Exception {
        Stage addGoodsStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/add_goods.fxml"));
        AnchorPane root = fxmlLoader.load();
        Scene scene = new Scene(root);
        AddGoodsController addGoodsController = fxmlLoader.getController();
        addGoodsController.setGoodsData(goodsData);
        addGoodsStage.setTitle("新增商品界面");
        //界面大小不可变
        addGoodsStage.setResizable(false);
        addGoodsStage.setScene(scene);
        addGoodsStage.show();
    }
    public void enter() {

        keywordsField.setText("");

    }
    //根据关键词搜索方法
    public void keywordsField() {
        goodsPane.getChildren().removeAll(goodsData);
        //获得输入的查询关键字
        String keywords = keywordsField.getText().trim();
        goodsList =goodsService.getGoodsLike(keywords);
        showGoodsData(goodsList);
    }
    //数据导出方法，采用hutool提供的工具类
    public void export() {
        ExcelExport.export(goodsList);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("提示信息");
        alert.setHeaderText("商品数据已导出!请到D盘根目录查看!");
        alert.showAndWait();
    }
}

