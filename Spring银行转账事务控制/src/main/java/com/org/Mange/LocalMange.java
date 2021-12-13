package com.org.Mange;

import com.mchange.v2.c3p0.DataSources;
import com.org.Bean.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author HP
 * @Date 2021/11/10 10:23
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Component
public class LocalMange {
    private ThreadLocal<Connection> threadLocal=new ThreadLocal<Connection>();
    @Autowired
    private DataSource ds;
    public Connection Conner() throws SQLException {
        Connection conn = threadLocal.get();
        if (conn==null){
            conn = ds.getConnection();
            threadLocal.set(conn);
        }
        return conn;
    }
}
