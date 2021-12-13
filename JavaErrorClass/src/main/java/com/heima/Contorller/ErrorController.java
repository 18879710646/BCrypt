package com.heima.Contorller;
import com.heima.Exception.BusinessError;
import com.heima.Exception.SysError;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
    @RequestMapping("/BusinessError")
    public String BusinessError(){
        BusinessError businessError = new BusinessError("名字不能为空");
        throw  businessError;
    }
    @RequestMapping("/SysError")
    public String SysError(){
        SysError sysError = new SysError("连接超时");
        throw  sysError;
    }
    @RequestMapping("/UnknowError")
    public String  UnKnowError(){
        int i=1/0;
        return "Success";
    }
}
