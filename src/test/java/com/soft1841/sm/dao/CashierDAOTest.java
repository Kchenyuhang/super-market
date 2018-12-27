package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Cashier;
import com.soft1841.sm.until.DAOFactory;
import org.junit.Test;


import java.sql.SQLException;
import java.util.List;


public class CashierDAOTest {
    //从工厂中获取到CashierDAO的实例
    private CashierDAO cashierDAO = DAOFactory.getCashierDAOInstance();

    @Test
    public void getCashierByAccount() throws SQLException {
        Cashier cashier = cashierDAO.getCashierByAccount("chenyuhang");
        System.out.println(cashier);
    }

    @Test
    public void selectCashiers() throws SQLException {
        List<Cashier> cashierList = cashierDAO.selectCashiers();
        cashierList.forEach(entity -> System.out.println(entity));
    }

    @Test
    public void deleteById() throws SQLException {
        cashierDAO.deleteById(3);
    }

    @Test
    public void countByRole() throws SQLException {
        int count = cashierDAO.countByRole("收银员");
        System.out.println(count);
    }

    @Test
    public void countByDepartment() throws SQLException {
        int count = cashierDAO.countByDepartment("软件1841");
        System.out.println(count);
    }

    @Test
    public void insertCashier() throws SQLException {
        Cashier cashier = new Cashier();
        cashier.setId(5l);
        cashier.setName("高金通");
        cashier.setNumber("05");
        cashier.setSexuality("男");
        cashier.setAge("18");
        cashier.setPicture("https://upload.jianshu.io/users/upload_avatars/14271592/24b6211b-1f88-4ad7-ab6f-39838bf2eebb?imageMogr2/auto-orient/strip|imageView2/1/w/120/h/120");
        cashier.setAccount("gaojintong");
        cashier.setPassword("123456");
        cashier.setRole("收银员");
        cashier.setDepartment("软件1841");
        System.out.println(cashierDAO.insertCashier(cashier));
    }
}