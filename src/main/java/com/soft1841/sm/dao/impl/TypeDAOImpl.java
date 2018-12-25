package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.TicketDAO;
import com.soft1841.sm.dao.TypeDAO;
import com.soft1841.sm.entity.Ticket;
import com.soft1841.sm.entity.Type;

import java.sql.SQLException;
import java.util.List;

public class TypeDAOImpl implements TypeDAO{

    @Override
    public Long insertType(Type type) throws SQLException {
        return null;
    }

    @Override
    public int deleteTypeById(long id) throws SQLException {
        return 0;
    }

    @Override
    public List<Entity> selectAllTypes() throws SQLException {
        return null;
    }

    @Override
    public Entity getTypeById(int id) throws SQLException {
        return null;
    }
}