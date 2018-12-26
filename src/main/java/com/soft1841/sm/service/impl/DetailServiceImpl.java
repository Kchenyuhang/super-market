package com.soft1841.sm.service.impl;

import com.soft1841.sm.dao.DetailDAO;
import com.soft1841.sm.entity.Detail;
import com.soft1841.sm.service.DetailService;
import com.soft1841.sm.until.DAOFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DetailServiceImpl implements DetailService {
    private DetailDAO detailDAO = DAOFactory.getDetailDAOInstance();
    @Override
    public Long addDetail(Detail detail) {
        long result =0;
        try {
            result =detailDAO.insertDetail(detail);
        } catch (SQLException e) {
            System.err.println("新增明细出现异常");
        }
        return result;
    }

    @Override
    public List<Detail> getAllDetails() {
        List<Detail> detailList = new ArrayList<>();
        try {
            detailList = detailDAO.selectAllDetail();
        } catch (SQLException e) {
            System.err.println("查询所有明细");
        }
        return detailList;
    }

    @Override
    public Detail getDetail(long id) {
        Detail detail = new Detail();
        try {
            detail = detailDAO.getDetailById(id);
        } catch (SQLException e) {
            System.err.println("查询单个明细");
        }
        return detail;
    }

    @Override
    public Detail getDetail(String date) {
        Detail detail = new Detail();
        try {
            detail = detailDAO.getDetailByDate(date);
        } catch (SQLException e) {
            System.err.println("根据日期查询明细");
        }
        return detail;
    }
}
