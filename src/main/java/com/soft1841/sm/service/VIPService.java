package com.soft1841.sm.service;


import com.soft1841.sm.entity.VIP;

import java.util.List;

/**
 * 商品类别服务层的重构
 * @auther 柳磊磊
 * 2018 12.26
 */
public interface VIPService {
    /**
     * 获取所有商品类别的功能
     * @return
     */
    List<VIP> getAllVIP();

    /**
     * 根据id查询类别
     * @param id
     * @return
     */
    VIP getVIP(long id);

    /**
     * 添加类别
     * @param vip
     */
    Long addVIP(VIP vip);

    /**
     * 删除类别
     * @param id
     */
    void deleteVIP(long id);
}
