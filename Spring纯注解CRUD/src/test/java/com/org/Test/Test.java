package com.org.Test;
import com.org.AppConfigcation.Configcation;
import com.org.Bean.User;
import com.org.Service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/7 10:11
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class Test {

    /**
     * 在关于(properties,xml,yml)的比较
     * properites:
     * 优点：简单容易读取(采用键值对的方式来存储)
     * 缺点：层级关系不方便表示
     * xml:
     * 优点：层级关系表示清晰
     * 缺点：配置复杂
     * yml：
     * 优点：使用空格表示层次关系，相同空格配置项属于同一级
     * 配置格式是以key:空格value，键值对之间是用空格表示
     *
     * @throws Exception
     */
@org.junit.Test
    public void SelectBy()throws Exception{
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configcation.class);
//  （@Repository，@Service中默认的名字为首字母小写的方法名） ,通常在命名Bean的时候，都是对Bean中的id进行命名的。
    Service service = context.getBean("serviceImpl", Service.class);
    List<User> users = service.SelectBy();
    System.out.println(users);
}
}
