package com.org.Service.ServiceImpl;

import com.org.Dao.Userdao;
import com.org.PoJo.User;
import com.org.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/20 10:51
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private Userdao userdao;
    @Override
    public List<User> FindAll() {
        return userdao.FindAll();
    }
@Transactional
    @Override
    public void Bank(String name1, String name2, int money) {
    User user1 = new User();
    user1.setMoney(money);
    user1.setName(name1);
    userdao.add(user1);
//    int i=1/0;
    User user2 = new User();
    user2.setMoney(money);
    user2.setName(name2);
    userdao.jian(user2);
    }
}
