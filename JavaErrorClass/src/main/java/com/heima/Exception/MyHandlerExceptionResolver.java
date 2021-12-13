package com.heima.Exception;

import org.omg.CORBA.SystemException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controller出现错误的时候就会调用这个方法
 * 统一异常处理类
 *
 */
// HandlerExceptionResolver 管理异常解析器
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView  mv=new ModelAndView();
        mv.setViewName("error");
        // 判断是否是编译错误
        if (e instanceof BusinessError) {
            // 把报错信息强制转换称为自定一错误信息格式
            BusinessError bus=(BusinessError) e;
            // 获取到报错信息，传送到ERROR.jsp页面中
            mv.addObject("msg",bus.getMessage());
        }
        else  if (e instanceof SystemException){
            SysError sys=(SysError) e;
            mv.addObject("msg", "访问繁忙，请稍后重试！");
            // 打印出来错误！，但是在项目中不能这样做，要是用log来日志
            sys.printStackTrace();
        }else {
            mv.addObject("msg","系统发生未知异常，请稍后重试");
            // 把异常打印出来
            e.printStackTrace();
        }
        return  mv;
    }
}
