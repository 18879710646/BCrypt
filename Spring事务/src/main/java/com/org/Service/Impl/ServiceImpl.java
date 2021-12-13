package com.org.Service.Impl;

import com.org.Bean.User;
import com.org.Dao.Dao;
import com.org.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/14 16:18
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@org.springframework.stereotype.Service
public class ServiceImpl  implements Service {
    @Autowired
    private Dao dao;
    public List<User> SelectById() throws SQLException {
        List<User> users = dao.SelectById();
        return users;
    }
    @Transactional
    public void Demo(String sname,String fname, int money) throws SQLException {
        dao.jiaqian(sname,money);
//        int i=1/0;
        dao.jianqian(fname,money);
    }


}
