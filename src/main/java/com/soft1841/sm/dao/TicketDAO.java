package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Ticket;

import java.sql.SQLException;
import java.util.List;

/**
 * 小票DAO接口
 */
public interface TicketDAO {
    /**
     * 增加小票
     * @param ticket
     * @return
     * @throws SQLException
     */
    Long insertTicket(Ticket ticket) throws SQLException;

    /**
     * 查询所有小票
     * @return
     * @throws SQLException
     */
    List<Ticket> selectAllTicket() throws SQLException;

    /**
     * 根据id查小票
     * @param id
     * @return
     * @throws SQLException
     */
    Ticket getTicketById(long id) throws SQLException;

    /**
     * 根据日期查小票
     * @param date
     * @return
     * @throws SQLException
     */
    Ticket getTicketByDate(String date) throws SQLException;

    /**
     * 根据收银员id查小票
     * @param CashierId
     * @return
     * @throws SQLException
     */
    Ticket getTicketByCashierId(long CashierId) throws SQLException;

}
