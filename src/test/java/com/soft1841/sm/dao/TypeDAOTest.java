package com.soft1841.sm.dao;
/**
 * @ author 柳磊磊
 * 2018.12.26
 */

import com.soft1841.sm.entity.Type;
import com.soft1841.sm.until.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class TypeDAOTest {
    //通过DAO工厂获得TypeDAO的实例
    private TypeDAO typeDAO = DAOFactory.getTypeDAOInstance();

    @Test
    public void insertType() throws SQLException {
        Type type = new Type();
        type.setTypeName("测试类别");
        System.out.println(typeDAO.insertType(type));
    }

    @Test
    public void deleteTypeById() throws SQLException {
        typeDAO.deleteTypeById(7);
    }

    @Test
    public void selectAllTypes() throws SQLException {
        List<Type> typeList = typeDAO.selectAllTypes();
        typeList.forEach(type -> System.out.println(type));
    }

    @Test
    public void getTypeById() throws SQLException {
        Type type = typeDAO.getTypeById(1);
        System.out.println(type);
    }
}