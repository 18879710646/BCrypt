package com.heima.Error;

import org.omg.CORBA.SystemException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//  利用spring中的接口HandlerExceptionResolver，来处理未知的异常
public class ErrorSys implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("error");
        if (e instanceof SystemException){
            mv.addObject("msg","系统运行异常");
        }
        else  if (e instanceof  NullPointerException){
            mv.addObject("msg","空指针异常");
        }
        else  if (e instanceof ClassCastException){
            mv.addObject("msg","出现了类型转换异常");
        }
        else {
            mv.addObject("msg","出现未知异常");
        }

            return mv;

    }
}
