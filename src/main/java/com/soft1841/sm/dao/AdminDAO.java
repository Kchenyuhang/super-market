package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Admin;

import java.sql.SQLException;

/**
 * 收银员DAO接口
 * @author 陈宇航
 * 2018.12.24
 */
public interface AdminDAO {
    Admin getAdminByAccount(String account) throws SQLException;
}
