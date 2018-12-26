package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.until.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;


/**
 * @author 陈宇航
 * 2018.12.
 */
public class AdminDAOTest {
    private AdminDAO adminDAO = DAOFactory.getAdminDAOInstance();

    @Test
    public void getAdminByAccount() throws SQLException {
        Admin admin = adminDAO.getAdminByAccount("chenyuhang");
        System.out.println(admin);
    }

    @Test
    public void selectAdmin() throws SQLException {
        List<Admin> adminList = adminDAO.selectAdmin();
        adminList.forEach(admin -> System.out.println(admin));
    }

}