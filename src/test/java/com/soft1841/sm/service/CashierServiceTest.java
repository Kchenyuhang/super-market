package com.soft1841.sm.service;

import com.soft1841.sm.entity.Cashier;
import com.soft1841.sm.until.ServiceFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class CashierServiceTest {

    private CashierService cashierService = ServiceFactory.getCashierServiceInstance();

    @Test
    public void login() {
        boolean flag = cashierService.login("chenyuhang","123456");
        assertEquals(true,flag);
    }

    @Test
    public void getAllCashiers() {
        List<Cashier> cashierList = cashierService.getAllCashiers();
        cashierList.forEach(cashier -> System.out.println(cashier));
    }

    @Test
    public void deleteCashier() {
        cashierService.deleteCashier(5);
    }

    @Test
    public void insertCashier() {
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
        System.out.println(cashier);
    }
}