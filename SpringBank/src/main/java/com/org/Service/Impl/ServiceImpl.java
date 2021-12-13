package com.org.Service.Impl;


import com.org.Bean.User;
import com.org.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/8 22:33
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Service
public class ServiceImpl implements com.org.Service.Service {
    @Autowired
    private UserDao userDao;
    public List<User> SelectBy() throws SQLException {
        return userDao.SelectBy();
    }
}
