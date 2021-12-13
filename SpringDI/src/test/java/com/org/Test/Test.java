package com.org.Test;

import com.org.Service.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author HP
 * @Date 2021/11/6 09:38
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class Test {
    @org.junit.Test
    public void Test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Service uce = context.getBean("uce", Service.class);
        uce.add();
        uce.delete();
    }
}
