package com.org.Test;

import com.org.Bean.User;
import com.org.Service.Service;
import jdk.management.resource.ResourceContextFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.naming.spi.ResolveResult;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/14 16:19
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
// 声明式事务意思是讲不需要修改java代码，在配置文件中声明就可以了
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class Test {
    @Autowired
    private Service service;
    @org.junit.Test
    public void Test() throws SQLException {

        List<User> users = service.SelectById();
        System.out.println(users);
    }
    @org.junit.Test
    public  void TestBank() throws SQLException{
        service.Demo("zs","ls",10);
    }
}
