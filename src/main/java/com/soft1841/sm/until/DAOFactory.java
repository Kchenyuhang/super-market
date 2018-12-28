package com.soft1841.sm.until;

import com.soft1841.sm.dao.*;
import com.soft1841.sm.dao.impl.*;
import com.soft1841.sm.entity.VIP;

/**
 * 工厂类，用静态方法来生成各个DAO实例
 * @auther 小组成员
 */
public class DAOFactory {
    /**
     * 静态方法，返回CashierDAO实现类的对象
     *
     * @return
     */
    public static CashierDAO getCashierDAOInstance() {
        return new CashierDAOImpl();
    }

    /**
     * 静态方法，返回AdminDAO实现类的对象
     *
     * @return
     */
    public static AdminDAO getAdminDAOInstance() {
        return new AdminDAOImpl();
    }
    /**

     * 静态方法，返回GoodsDAO实现类的对象

     *

     * @return

     */

    public static GoodsDAO getGoodsDAOInstance() {

        return new GoodsDAOImpl();

    }

    /**
     * 静态方法，返回TypeDAO实现类的对象
     *
     * @return
     */


    public static TypeDAO getTypeDAOInstance() {
        return new TypeDAOImpl();
    }
    public static TicketDAO getTicketDAOInstance() {
        return  new TicketDAOImpl();
    }
    public static DetailDAO getDetailDAOInstance() {
        return new DetailDAOImpl();
    }


   public static VIPDAO getVIPDAOInstance() {
        return  new VIPDAOImpl();
    }
}
