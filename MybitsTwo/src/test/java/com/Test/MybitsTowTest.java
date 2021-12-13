package com.Test;

import com.org.Bean.User;
import com.org.Bean.UserB;
import com.org.Dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
/**
 * @Author HP
 * @Date 2021/11/2 17:56
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class MybitsTowTest {


//    一对多
    @Test
    public void SelectOneAndOne() throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = build.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<UserB> userBS = mapper.FindAllByIdOnAndTwo();
        System.out.println(userBS);
        sqlSession.close();
    }
}
