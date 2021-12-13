package com.org.AppConfigcation;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author HP
 * @Date 2021/11/7 10:09
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Configuration    // 声明该类是配置类
// 必须要声明该类是配置类才能使用配置类中的注解，该注解表示为扫描com.org以下的文件，看是否有注入bean中的注解（@Repository,@Service,@Controller）
// @Componen表示的是把该类添加到Bean中去，里面的方法也会添加进去
@ComponentScan(basePackages = "com.org")
// 该注解表示为把resoures中的db.properties中的文件导入进来，用@Value来进行数据的获取
@PropertySource("classpath:db.properties")
public class Configcation {
    @Value("${jdbc.driverClass}")
            private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String user;
    @Value("${jdbc.password}")
    private String password;
    @Bean   // 表示为该方法添加到Spring的Bean容器中
    public ComboPooledDataSource Datas() throws Exception{
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);
        return comboPooledDataSource;
    }

    @Bean
    public QueryRunner runner(ComboPooledDataSource ds){
        QueryRunner queryRunner = new QueryRunner(ds);
        return queryRunner;
    }
}
