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

     * 新增图书类别, 返回自增主键(Long)

     * @param type

     * @return

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

     */

    List<Type> selectAllTypes() throws SQLException;



    /**

     * 根据id查询类别信息

     * @param id

     * @return

     */

    Type getTypeById(long id) throws SQLException;

    List<Entity> selectTypesLike(String keywords) throws SQLException;

    List<Entity> selectTypesByType(long typeID) throws SQLException;
}