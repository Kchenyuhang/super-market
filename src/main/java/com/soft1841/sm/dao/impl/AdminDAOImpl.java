package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.AdminDAO;
import com.soft1841.sm.entity.Admin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈宇航
 * 2018.12.24
 */
public class AdminDAOImpl implements AdminDAO {

    /**
     * 管理员查询方法
     * @param account
     * @return
     * @throws SQLException
     */
    @Override
    public Admin getAdminByAccount(String account) throws SQLException {
        Entity entity = Db.use().queryOne("SELECT * FROM t_manager WHERE account = ? ", account);
        return converAdmin(entity);
    }

    /**
     * 封装一个将Entity转换为Admin的方法
     * @param entity
     * @return
     */
    private Admin converAdmin(Entity entity) {
        Admin admin = new Admin();
        admin.setId(entity.getLong("id"));
        admin.setName(entity.getStr("name"));
        admin.setSexuality(entity.getStr("sexuality"));
        admin.setAccount(entity.getStr("account"));
        admin.setPassword(entity.getStr("password"));
        admin.setPicture(entity.getStr("picture"));
        return admin;
    }


    @Override
    public List<Admin> selectAdmin() throws SQLException {
        List<Entity> entityList = Db.use().query("SELECT * FROM t_manager ");
        List<Admin> adminList = new ArrayList<>();
        for (Entity entity: entityList) {
            adminList.add(converAdmin(entity));
        }
        return adminList;
    }
}
