package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Cashier;
import com.soft1841.sm.entity.Detail;

import java.sql.SQLException;
import java.util.List;

/**
 * 小票明细DAO接口
 */
public interface DetailDAO {
    /**
     * 增加明细
     * @param detail
     * @return
     * @throws SQLException
     */
    Long insertDetail(Detail detail) throws SQLException;

    /**
     * 查询所有明细
     * @return
     * @throws SQLException
     */
    List<Detail> selectAllDetail() throws SQLException;

    /**
     * 根据id查明细
     * @param id
     * @return
     * @throws SQLException
     */
    Detail getDetailById(long id) throws SQLException;

    /**
     * 根据日期查询明细
     * @param date
     * @return
     * @throws SQLException
     */
    Detail getDetailByDate(String date) throws SQLException;
}
