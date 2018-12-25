package com.soft1841.sm.dao;

import cn.hutool.db.Entity;
import com.soft1841.sm.entity.Type;

import java.sql.SQLException;
import java.util.List;

/**
 * 商品种类接口
 * @auther 柳磊磊
 * 2018 12.24
 */
public interface TypeDAO {
    /**
     * 新增商品类别，返回自增主键（Long）
     * @param type
     * @return
     * @throws SQLException
     */
    Long insertType(Type type) throws SQLException;

    /**
     * 根据id删除类别
     * @param id
     * @return
     */
    int deleteTypeById(long id) throws SQLException;

    /**
     * 查询所有类别
     * @return
     * @throws SQLException
     */
    List<Entity> selectAllTypes() throws SQLException;

    /**
     * 根据id查询类别
     * @param id
     * @return
     * @throws SQLException
     */
    Entity getTypeById(long id) throws SQLException;


    /**
     * 根据书名关键词模糊查询图书
     * @param  keywords
     * @return
     * @throws SQLException
     */
    List<Entity> selectTypesLike(String keywords) throws SQLException;

    /**
     * 根据图书类别查询图书
     * @param typeID
     * @return
     * throws SQLException
     */
    List<Entity> selectTypesByType(long typeID) throws SQLException;
}
