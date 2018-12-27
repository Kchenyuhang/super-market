package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Cashier;

import java.sql.SQLException;
import java.util.List;

/**
 * 收银员DAO接口
 * @author 陈宇航
 * 2018.12.24
 */
public interface CashierDAO {

    /**
     * 根据工号查询收银员
     * @param account
     * @return
     * @throws SQLException
     */
    Cashier getCashierByAccount(String account) throws SQLException;

    /**
     * 查询所有收银员信息
     * @return List<Cashier>
     * @throws SQLException
     */
    List<Cashier> selectCashiers() throws SQLException;

    /**
     * 根据id删除实体
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteById(long id) throws SQLException;

    /**
     * 新增一个收银员，返回自增主键
     * @param cashier
     * @return
     * @throws SQLException
     */
    Long insertCashier(Cashier cashier) throws SQLException;

    /**
     * 根据身份角色统计收银员数量
     * @param role
     * @return
     * @throws SQLException
     */
    int countByRole(String role) throws SQLException;

    /**
     * 根据身份角色统计收银员数量
     * @param department
     * @return
     * @throws SQLException
     */
    int countByDepartment(String department) throws SQLException;
}
