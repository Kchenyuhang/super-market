package com.soft1841.sm.service.impl;

import com.soft1841.sm.dao.AdminDAO;
import com.soft1841.sm.entity.Admin;
import com.soft1841.sm.service.AdminService;
import com.soft1841.sm.until.DAOFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class AdminServiceImpl implements AdminService {
    private AdminDAO adminDAO = DAOFactory.getAdminDAOInstance();

    @Override
    public boolean login(String account, String password) {
        Admin admin = null;
        try {
            admin = adminDAO.getAdminByAccount(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //根据账号查找成功
        if (admin != null) {
            //比较密码
            if (password.equals(admin.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Admin> getAllAdmins() {
        List<Admin> adminList = new ArrayList<>();
        try {
            adminList = adminDAO.selectAdmin();
        } catch (SQLException e) {
           //友好处理
            System.err.println("查询所有管理员出现异常！");
        }
        return adminList;
    }
}
