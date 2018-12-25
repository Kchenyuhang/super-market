package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.DetailDAO;
import com.soft1841.sm.entity.Cashier;
import com.soft1841.sm.entity.Detail;

import java.sql.SQLException;
import java.util.List;

public class DetailDAOImpl implements DetailDAO {

    @Override
    public Long insertDetail(Detail detail) throws SQLException {
        return null;
    }

    @Override
    public List<Detail> selectAllDetail() throws SQLException {
        return null;
    }

    @Override
    public Detail getDetailById(long id) throws SQLException {
        return null;
    }

    @Override
    public Detail getDetailByDate(String date) throws SQLException {
        return null;
    }
}
