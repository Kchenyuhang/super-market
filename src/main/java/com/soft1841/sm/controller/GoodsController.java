package com.soft1841.sm.controller;

import com.soft1841.sm.entity.Goods;
import com.soft1841.sm.entity.Type;
import com.soft1841.sm.until.ServiceFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class GoodsController  implements Initializable{
    //布局文件中的表格视图对象，用来显示数据库中读取的所有商品信息
    @FXML
    private TableView<Goods> goodsTable;
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
    //图书Service对象，从DAO工厂通过静态方法获得
    private GoodsService goodsService = ServiceFactory.get
    @Override
    public void initialize(URL location , ResourceBundle resources) {

    }
}