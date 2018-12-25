package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.until.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * @author 陈宇航
 * 2018.12.
 */
public class AdminDAOTest {
    private AdminDAO adminDAO = (AdminDAO) DAOFactory.getAdminDAOInstance();
    @Test
    public void getAdminByAccount() throws SQLException {
        Admin admin = adminDAO.getAdminByAccount("1802343303");
        System.out.println(admin);
    }

}