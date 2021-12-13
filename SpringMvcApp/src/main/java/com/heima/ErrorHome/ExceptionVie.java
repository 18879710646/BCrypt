package com.heima.ErrorHome;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author HP
 * @Date 2021/10/23 12:38
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
// 把这个ERROR类生成Bean加载到容器中就行，前端控制器器会自动找到该类文件
//处理区
public class ExceptionVie implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("error");
        if (e instanceof MyBusiness){
            // 强制转换
            MyBusiness bus=(MyBusiness) e;
            mv.addObject(bus.getMessage());
        }
        else  if(e instanceof  MySysError){
            mv.addObject("msg","操作次数过多，请稍后操作！");
        }
        return mv.addObject("msg","发生了配置异常");
    }
}
