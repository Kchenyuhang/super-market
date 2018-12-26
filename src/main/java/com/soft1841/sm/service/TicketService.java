package com.soft1841.sm.service;

import com.soft1841.sm.entity.Ticket;

import java.util.List;

public interface TicketService {
    /**
     *新增小票
     * @param ticket
     * @return
     */
    Long addTicket(Ticket ticket);

    /**
     *查询所有小票
     * @return
     */
    List<Ticket> getAllTickets();

    /**
     *根据id查询小票
     * @param id
     * @return
     */
    Ticket getTicket(long id);

    /**
     *
     * @param date
     * @return
     */
   Ticket getTicket(String date);






}
