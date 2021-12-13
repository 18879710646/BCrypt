package com.org.Test;

import com.org.Bean.User;
import com.org.Service.Service;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/6 16:57
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class Test {
    @Autowired
    private Service service;
    //添加
    @org.junit.Test
    public void add() throws SQLException {
        User user = new User();
        user.setName("aa");
        user.setAge(12);
        user.setAddress("西藏");
        service.add(user);
    }
    // 查询
    @org.junit.Test
    public void SelectById() throws SQLException{
        List<User> users = service.SelectById();
        System.out.println(users);
    }

//     删除所选id的数据
    @org.junit.Test
    public void DeleteById()throws SQLException{
        Boolean aBoolean = service.DeleteById(2);
        System.out.println(aBoolean);
    }

    // 更新数据
    @org.junit.Test
    public void UploadById() throws SQLException{
        User user = new User();
        user.setId(1);
        user.setName("jiejie");
        user.setAge(12);
        user.setAddress("冰岛");
        boolean aboolean= service.UploadById(user);
        System.out.println(aboolean);
    }

}
