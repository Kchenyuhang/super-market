package com.soft1841.sm.service;

import com.soft1841.sm.entity.Cashier;

import java.util.List;

/**
 * 收银员业务逻辑接口
 * @author 陈宇航
 * 2018.12.24
 */
public interface CashierService {

    /**
     * 登录功能
     * @param account
     * @param password
     * @return
     */
    boolean login(String account, String password);

    /**
     * 查询所有收银员信息
     * @return
     */
    List<Cashier> getAllCashiers();

    /**
     * 根据id删除收银员
     * @param id
     */
    void deleteCashier(long id);

    /**
     * 新增一个收银员，返回自增主键
     * @param cashier
     * @return
     */
    Long insertCashier(Cashier cashier);

    /**
     * 根据身份角色统计收银员数量
     * @param role
     * @return
     */
    int countByRole(String role);

    /**
     * 根据身份角色统计收银员数量
     * @param department
     * @return
     */
    int countByDepartment(String department);
}
