package com.soft1841.sm.until;

import cn.hutool.db.Entity;
import com.soft1841.sm.dao.*;
import com.soft1841.sm.dao.impl.*;
import com.soft1841.sm.entity.Cashier;
import com.soft1841.sm.entity.Type;

import java.sql.SQLException;
import java.util.List;

/**
 * 工厂类，用静态方法来生成各个DAO实例
 */
public class DAOFactory {
    /**
     * 静态方法，返回CashierDAO实现类的对象
     * @return
     */
    public static CashierDAO getCashierDAOInstance() {
        return new CashierDAOImpl();
    }

    /**
     * 静态方法，返回AdminDAO实现类的对象
     * @return
     */
    public static AdminDAO getAdminDAOInstance() {
        return new AdminDAOImpl();
    }

    /**
     * 静态方法，返回TypeDAO实现类的对象
     * @return
     */
    public static TypeDAO getTypeDAOInstance    () {

        return new TypeDAOImpl();
    }
}
