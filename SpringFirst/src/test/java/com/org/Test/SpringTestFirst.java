package com.org.Test;

import com.org.Dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author HP
 * @Date 2021/11/4 20:04
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class SpringTestFirst {
    @Test
    public void Test(){
//         利用工厂模式，获取配置信息
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//         利用配置信息中的数据，获取到spring容器中的bean，通过填写bean的名称，
//         和该接口的类文件（通过这波操作可以不用自己new处对象来，并且在applicationContext中配置的信息，我们可以看出是实现类是交给Spring管理的
        UserDao userDao = context.getBean("UserDao", UserDao.class);
        userDao.add();
    }
}
