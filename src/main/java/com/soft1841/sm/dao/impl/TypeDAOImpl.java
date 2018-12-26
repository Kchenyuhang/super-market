package com.soft1841.sm.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.TypeDAO;
import com.soft1841.sm.entity.Type;

import java.sql.SQLException;
import java.util.List;

public class TypeDAOImpl implements TypeDAO{
    @Override
    public Long insertType(Type type) throws SQLException {
        //采用了另一种新增方法，可以返回插入记录的主键（Long类型）

        return Db.use().insertForGeneratedKey(

                Entity.create("t_type")

                        .set("type_Name", type.getTypeName())

        );
    }

    @Override
    public int deleteTypeById(long id) throws SQLException {
        return 0;
    }

    @Override
    public List<Type> selectAllTypes() throws SQLException {
        return null;
    }

    @Override
    public Type getTypeById(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Entity> selectTypesLike(String keywords) throws SQLException {
        return null;
    }

    @Override
    public List<Entity> selectTypesByType(long typeID) throws SQLException {
        return null;
    }
}