package com.soft1841.sm.service;

import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.until.ServiceFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class AdminServiceTest {
    private AdminService adminService = ServiceFactory.getAdminServiceInstance();

    @Test
    public void login() {
        boolean flag = adminService.login("chenyuhang","123456");
        assertEquals(true,flag);
    }

    @Test
    public void selectAllAdmins() {
        List<Admin> adminList = adminService.getAllAdmins();
        adminList.forEach(admin -> System.out.println(admin));
    }

}