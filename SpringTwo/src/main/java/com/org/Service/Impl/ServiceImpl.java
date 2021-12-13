package com.org.Service.Impl;

import com.org.Dao.UserDao;
import com.org.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author HP
 * @Date 2021/11/6 15:08
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    public void add() {
        System.out.println("执行了ServiceImpl中的add");
    }
    @PostConstruct
    public void init(){
        System.out.println("创建时调用");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁时调用");
    }


//    这样可以直接注入到字符串中name中值
    @Value("郑建成")
    private String name;
    public void name(){
        System.out.println("name="+name);
    }
}
