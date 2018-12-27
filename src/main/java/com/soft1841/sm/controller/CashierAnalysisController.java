package com.soft1841.sm.controller;

import com.soft1841.sm.service.CashierService;
import com.soft1841.sm.until.ServiceFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CashierAnalysisController implements Initializable {
    @FXML
    private StackPane departmentPieChart,rolePieChart;
    private String[] departments = {"软件1841","软件1831","软件1811","软件1821","软件1813"};
    private String[] roles = {"管理员","收银员"};
    private CashierService cashierService = ServiceFactory.getCashierServiceInstance();
    private ObservableList<PieChart.Data> pieChartData1 = FXCollections.observableArrayList();
    private ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initDepartmentPieChart();
        initRolePieChart();
    }
    private void initDepartmentPieChart() {
        for (String department : departments) {
            int count = cashierService.countByDepartment(department);
            pieChartData1.add(new PieChart.Data(department,count));
        }
        final PieChart chart = new PieChart(pieChartData1);
        chart.setTitle("按班级统计饼图");
        departmentPieChart.getChildren().add(chart);
    }

    private void initRolePieChart() {
        for (String role : roles) {
            int count = cashierService.countByRole(role);
            pieChartData2.add(new PieChart.Data(role,count));
        }
        final PieChart chart = new PieChart(pieChartData2);
        chart.setTitle("按角色统计饼图");
        rolePieChart.getChildren().add(chart);
    }
}
