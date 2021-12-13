package com.heima.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author HP
 * @Date 2021/10/24 12:47
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

/**
 * 通过上下文请求路径来使用拦截器，如果是在SpringMvc.xml中配置了拦截了该路径，那么就会进入到自定义拦截器中，我在该拦截器中添加了判断，如果
 * session中没有loginname的值，那么就会进入到if判断中，如果是session中有该值，那么就直接重定向到其他的页面中
 */
@Controller
public class InterceptorController {
    @RequestMapping("/Test")
    public String Test(HttpSession session, HttpServletRequest request){
        session.setAttribute("loginname","张三");
        System.out.println("Controller");
        return "Success";
    }
    @RequestMapping("/show")
    public String Show(HttpSession session){
//        session.setAttribute("loginname","张三");
        System.out.println("Controller");
        return "Success";
    }
}
