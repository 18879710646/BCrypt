package com.org.Test;

import com.org.Dao.Userdao;
import com.org.PoJo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/20 11:28
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class AcconeTest {
    @Test
    public void Test()throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        Userdao mapper = sqlSession.getMapper(Userdao.class);
        List<User> users = mapper.FindAll();
        System.out.println(users);
        sqlSession.close();
    }



    @Test
    public void Test2()throws Exception {
        //NEW 出Spring容器对象，来对数据操作
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");

        Userdao userdao = applicationContext.getBean(Userdao.class);
        List<User> users = userdao.FindAll();
        System.out.println(users);

    }
}
