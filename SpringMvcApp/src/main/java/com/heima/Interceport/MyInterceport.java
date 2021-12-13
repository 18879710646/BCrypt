package com.heima.Interceport;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author HP
 * @Date 2021/10/23 14:56
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
public class MyInterceport implements HandlerInterceptor{
    // 执行Conroller之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入到拦截器中");
        System.out.println(request.getRequestURI());
        HttpSession session = request.getSession();
        //返回值如果是false，那么就显示不放行，如果是true那么就显示的是放行
        if (null==session.getAttribute("loginname")){
            response.sendRedirect("/page/login.jsp");
            return false;
        }
        System.out.println("PreHandle......................");
        return true;

    }
    // 执行Controller之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("PostHandle.............................................");
    }
    //不管是否有异常都会执行一次
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("After.......................................");
    }
}
