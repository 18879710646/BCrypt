package com.org.Service.Impl;

import com.org.Dao.UserDao;
import com.org.Service.Service;

/**
 * @Author HP
 * @Date 2021/11/6 09:42
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class ServiceImpl implements Service {
    public ServiceImpl() {
    }

//     为有参构造使用用依赖注入的方式来为有参构造注入值
    public ServiceImpl(UserDao userDao, String address) {
        this.userDao = userDao;
        System.out.println(this.userDao);
        this.address = address;
        System.out.println(this.address);
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("执行了seTUserDao");
        this.userDao = userDao;
    }
//    要使Spring帮你完成依赖注入，那么在需要获取的的变量必须要写set方法，不然是不会注入进去的。
    private UserDao userDao;  // 需要依赖复制的变量

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;   // 这是简单的value值注入操作

    public void add() {
        System.out.println("执行了UserImpl中的add");
        userDao.add();
    }
    public void delete() {
        System.out.println("value="+address);
        System.out.println("执行了ServiceImpl中的Dete");
    }
}
