package com.org.Service.Impl;

import com.org.Bean.User;
import com.org.Dao.UserDao;
import com.org.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/6 16:55
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private UserDao userDao;
    public void add(User user) throws SQLException {
        userDao.add(user);
    }

//    查询
    public List<User> SelectById() throws SQLException{
        return userDao.SelectById();
    }

    public Boolean DeleteById(int id) throws SQLException {
        return userDao.DeleteById(id);
    }

    public Boolean UploadById(User user) throws SQLException {
        return userDao.UploadById(user);
    }
}
