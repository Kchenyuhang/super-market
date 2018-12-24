package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.AdminDAO;
import com.soft1841.sm.entity.Admin;

import java.sql.SQLException;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class AdminDAOImpl implements AdminDAO {

    @Override
    public Admin getAdminByAccount(String account) throws SQLException {
        Entity entity = Db.use().queryOne("SELECT * FROM t_manager WHERE account = ? ", account);
        return converAdmin(entity);
    }
    private Admin converAdmin(Entity entity) {
        Admin admin = new Admin(entity.getLong("id"),entity.getStr("name"),entity.getStr("sexuality"),
                entity.getStr("account"),entity.getStr("password"),entity.getStr("picture"));
        return admin;
    }
}
