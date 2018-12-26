package com.soft1841.sm.service.impl;

import com.soft1841.sm.dao.TicketDAO;
import com.soft1841.sm.entity.Ticket;
import com.soft1841.sm.service.TicketService;
import com.soft1841.sm.until.DAOFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TicketServiceImpl implements TicketService {
    private TicketDAO ticketDAO = DAOFactory.getTicketDAOInstance();
    @Override
    public Long addTicket(Ticket ticket) {
        long result = 0;
        try {
            result = ticketDAO.insertTicket(ticket);
        } catch (SQLException e) {
            System.err.println("新增小票");
        }
        return result;
    }

    @Override
    public List<Ticket> getAllTickets() {
        List<Ticket> ticketList = new ArrayList<>();
        try {
            ticketList = ticketDAO.selectAllTicket();
        } catch (SQLException e) {
            System.err.println("查询所有小票");
        }
        return ticketList;
    }

    @Override
    public Ticket getTicket(long id) {
        Ticket ticket = new Ticket();
        try {
            ticket = ticketDAO.getTicketById(id);
        } catch (SQLException e) {
            System.err.println("查询单个小票");
        }
        return ticket;
    }

    @Override
    public Ticket getTicket(String date) {
        Ticket ticket = new Ticket();
        try {
            ticket =ticketDAO.getTicketByDate(date);
        } catch (SQLException e) {
            System.err.println("根据日期查询小票");
        }
        return ticket;
    }
}
