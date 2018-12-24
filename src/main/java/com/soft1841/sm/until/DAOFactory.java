package com.soft1841.sm.until;

import com.soft1841.sm.dao.*;
import com.soft1841.sm.dao.impl.*;
import com.soft1841.sm.entity.Cashier;

/**
 * 工厂类，用静态方法来生成各个DAO实例
 */
public class DAOFactory {
    /**
     * 静态方法，返回TypeDAO实现类的对象
     * @return
     */
    public static TypeDAO getTypeDAOInstance() {
        return new TypeDAOImpl();
    }

    /**
     * 静态方法，返回GoodsDAO实现类的对象
     * @return
     */
    public static GoodsDAO getGoodsDAOInstance() {
        return new GoodsDAOImpl();
    }

    /**
     * 静态方法，返回CashierDAO实现类的对象
     * @return
     */
    public static CashierDAO getCashierDAOInstance() {
        return new CashierDAOImpl();
    }

    /**
     * 静态方法，返回VIPDAO实现类的对象
     * @return
     */
    public static VIPDAO getVIPDAOInstance() {
        return new VIPDAOImpl();
    }

    /**
     * 静态方法，返回TicketDAO实现类的对象
     * @return
     */
    public static TicketDAO getTicketDAOInstance() {
        return new TicketDAOImpl();
    }

    /**
     * 静态方法，返回DetailDAO实现类的对象
     * @return
     */
    public static DetailDAO getDetailDAOInstance() {
        return new DetailDAOImpl();
    }
}
