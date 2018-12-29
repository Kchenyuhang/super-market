package com.soft1841.sm.controller;

import com.soft1841.sm.service.GoodsService;
import com.soft1841.sm.service.TypeService;
import com.soft1841.sm.until.ServiceFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * 商品种类统计控制器
 * @author 柳磊磊
 */
public class TypeAnalysisController implements Initializable {
    @FXML
    private StackPane typePieChart;
    private String[] types = {"服装","百货","食品","数码","化妆","图书","玩具","运动"};
    private TypeService typeService = ServiceFactory.getTypeServiceInstance();
    private ObservableList<PieChart.Data> pieChartData3 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTypePieChart();
    }

    private void initTypePieChart() {
    }
}

//import com.soft1841.sm.service.TypeService;
//import com.soft1841.sm.until.ServiceFactory;
//import javafx.collections.FXCollections;
//        import javafx.collections.ObservableList;
//        import javafx.fxml.FXML;
//        import javafx.fxml.Initializable;
//        import javafx.scene.chart.PieChart;
//        import javafx.scene.layout.StackPane;
//
//        import java.net.URL;
//        import java.util.ResourceBundle;
//
//public class TypeAnalysisController implements Initializable {
//    @FXML
//    private StackPane departmentPieChart, rolePieChart;
//
//    private String[] departments = {"服装","百货","食品","数码","化妆","图书","玩具","运动"};
//    private TypeService readerService = ServiceFactory.getTypeServiceInstance();
//
//    private ObservableList<PieChart.Data> pieChartData1 = FXCollections.observableArrayList();
//
//    private ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList();
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        initDepartmentPieChart();
//        initRolePieChart();
//    }
//
//    private void initRolePieChart() {
//    }
//
//    private void initDepartmentPieChart() {
//        for (String department : departments) {
//            pieChartData1.add(new PieChart.Data(department，));
//        }
//        final PieChart chart = new PieChart(pieChartData1);
//        chart.setTitle("按商品种类统计饼图");
//        departmentPieChart.getChildren().add(chart);
//    }
//}


