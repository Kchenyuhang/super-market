package com.soft1841.sm.service;

import com.soft1841.sm.entity.VIP;
import com.soft1841.sm.until.ServiceFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class VIPServiceTest {
    private VIPService vipService = ServiceFactory.getVIPServiceInstance();

    @Test
    public void getAllVIP() {
        List<VIP> vipList = vipService.getAllVIP();
        vipList.forEach(vip -> System.out.println(vip));
    }

    @Test
    public void deleteVIP() {
        vipService.deleteVIP(2);
    }

    @Test
    public void addVIP() {
        VIP vip = new VIP();
        vip.setId(3l);
        vip.setPhone("12345678911");
        vip.setName("柳磊磊");
        vip.setProvince("甘肃");
        vip.setNumber("0");
        System.out.println(vip);
    }

}