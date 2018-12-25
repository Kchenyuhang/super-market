package com.soft1841.sm.service;

/**
 * 管理员业务逻辑接口
 * @author 陈宇航
 * 2018.12.24
 */
public interface AdminService {

    /**
     * 登录功能
     * @param account
     * @param password
     * @return
     */
    boolean login(String account, String password);
}
