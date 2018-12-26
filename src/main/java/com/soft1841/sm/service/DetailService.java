package com.soft1841.sm.service;

import com.soft1841.sm.entity.Detail;

import java.util.List;

public interface DetailService {
    /**
     *增加读者信息
     * @param detail
     * @return
     */
    Long addDetail(Detail detail);

    /**
     *查询所有读者信息
     * @return
     */
    List<Detail> getAllDetails();

    /**
     * 根据id查询读者信息
     * @param id
     * @return
     */
    Detail getDetail(long id);

    /**
     *
     * @param date
     * @return
     */
    Detail getDetail(String date);





}
