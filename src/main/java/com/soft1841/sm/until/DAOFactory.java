package com.soft1841.sm.until;

import com.soft1841.sm.dao.*;
import com.soft1841.sm.dao.impl.*;
import com.soft1841.sm.entity.Cashier;

/**
 * 工厂类，用静态方法来生成各个DAO实例
 * @author 陈宇航
 * 2018.12.24
 */
public class DAOFactory {
    public static CashierDAO getCashierDAOInstance() {
        return new CashierDAOImpl();
    }
}
