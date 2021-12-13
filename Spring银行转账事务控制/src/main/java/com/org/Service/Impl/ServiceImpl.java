package com.org.Service.Impl;

import com.org.Bean.Bank;
import com.org.Dao.UserDao;
import com.org.Mange.LocalMange;
import com.org.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/8 21:30
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private LocalMange localMange;
    @Autowired
    private UserDao userDao;

    public void SelectBy(String name1 ,String name2,int money)throws SQLException {
        Connection conner=null;
        try {
            // 设置初始值

            conner = localMange.Conner();
            conner.setAutoCommit(false);
            userDao.fuqian(name1,money);
            userDao.shouqian(name2,money);

            //设置默认提交位false
            conner.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                if (conner!=null){
                    conner.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                if (conner!=null){
                    conner.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
