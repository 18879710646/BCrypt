package com.org.Test;

import com.org.Dao.Userdao;
import com.org.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/10/30 14:34
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

/**
 * mybits中的一级缓存是mybits自带的，所以本身自己是不能设置的，你不的不用，在查询的时候都是会先查询到一级缓存中的数据，在增删改的时候，会对一级缓存中的数据进行更新，一级缓存的生命周期跟sqlSession的生命周期是一样的，数据是保存在sqlSession中的
 * 二级缓存，是可以自己控制的，但是要进行配置，在SqlMapConfig.xml中进行配置，数据是保存在SqlSessionFactory，二级缓存中的数据是没有生命周期的，但是是有过期时间的。在使用二级缓存的时候，要在POJO类实现 java.io.Serializable 接口。
 */
public class TestMybits {
//    查询出所有的数据
    @Test
    public  void funo1() throws Exception {

        // 获取到核心配置文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建会话的工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //把数据流放进会话工厂中，获取会话
        SqlSessionFactory sessionFactory = builder.build(resourceAsStream);   // 建造者模式
        // 打开会话工厂    sessionFactory.openSession(true)  表示的是否自动提交事务
        SqlSession session = sessionFactory.openSession();        // 工厂模式
        // 通过会话中的获取映射，把Userdao的类文件放进去，获取到动态代理对象
        Userdao mapper = session.getMapper(Userdao.class);     // 代理模式
        // 通过代理对象调用findAll方法,从而获取到数据
        List<User> users = mapper.findAll();
        System.out.println(users);
        //释放资源
        session.close();
    }

    // 通过ID来查询出单条数据
    @Test
    public  void  findId() throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = build.openSession();
        Userdao mapper = sqlSession.getMapper(Userdao.class);
        List<User> listid = mapper.findId(1);
        System.out.println(listid);
        sqlSession.close();
    }

    // 增加数据
    @Test
    public void findAdd()throws Exception{
        // 获取到核心配置文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        Userdao mapper = sqlSession.getMapper(Userdao.class);
        User user=new User("admin4","男",new Date(),"厦门");
        int add = mapper.findAdd(user);
        System.out.println(add);
        sqlSession.commit();
        sqlSession.close();
    }

    // 删除数据
    @Test
    public void deleteId()throws  Exception{
        InputStream Stream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Stream);
        SqlSession sqlSession = build.openSession();
        Userdao mapper = sqlSession.getMapper(Userdao.class);
        Boolean aBoolean = mapper.deleteId(1);
        sqlSession.commit();
        System.out.println(aBoolean);
        sqlSession.close();

    }

    //模糊查询#
    @Test
    public void findlikeid()throws Exception{
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        Userdao mapper = sqlSession.getMapper(Userdao.class);
        List<User> users = mapper.findlikeId("w%");
        System.out.println(users);
        sqlSession.commit();
        sqlSession.close();
    }

    // 模糊查询$
    @Test
    public void findlikeid2()throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = build.openSession();
        Userdao mapper = sqlSession.getMapper(Userdao.class);
        List<User> users = mapper.findlikeId2("l%");
        System.out.println(users);
        sqlSession.commit();
        sqlSession.close();
    }

    // #表示的是占位的意思，可以防止sql注入,在传入到Userdao.xml中的时候，JDBC会对进来的数据进行转换，在连接数据库进行查询
    //$表示的是拼接的意思，不能防止sql注入，传到Userdao.xml中的时候接拼接查找，而且在Userdao.xml中的语法'$()'只能是value,已经被写死了。


    // 更新数据
    @Test
    public void UpdateById()throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = build.openSession();
        Userdao mapper = sqlSession.getMapper(Userdao.class);
        User user = new User(2,"aa","女",new Date(),"西藏");
        Boolean aBoolean = mapper.UploadById(user);
        System.out.println(aBoolean);
        sqlSession.commit();
        sqlSession.close();
    }
    // 动态sql（if）
    @Test
    public void SQLif()throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = build.openSession();  // 这里就是设置Mybits(JDBC)事务的地方，默认为f
        Userdao mapper = sqlSession.getMapper(Userdao.class);
        User user = new User();
//        user.setUsername("aa");
        user.setUid(12);
        List<User> userList = mapper.findAllsqlif(user);
        System.out.println(userList);
        sqlSession.close();

    }

    //动态sql（where）
    @Test
    public  void SQlWhere()throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = build.openSession();
        Userdao mapper = sqlSession.getMapper(Userdao.class);
        User user = new User();
//        user.setUid(2);
        user.setUsername("admin");
        List<User> userList = mapper.findAllWhere(user);
        System.out.println(userList);
        sqlSession.close();
    }

    // 动态sql(forench)
    @Test
    public void SQLForench() throws Exception{

        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = build.openSession();
        Userdao mapper = sqlSession.getMapper(Userdao.class);
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i=12;i<=16;i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        List<User> allForench = mapper.findAllForench(arrayList);
        System.out.println(allForench);
        sqlSession.close();
    }
}
