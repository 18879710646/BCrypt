package com.heima.Controller;

import com.heima.ErrorHome.MyBusiness;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * @Author HP
 * @Date 2021/10/23 12:11
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Controller
public class Test {
    @RequestMapping("/Test")
    public String  Test( HttpSession session,HttpServletRequest request){
        System.out.println("刚进入到Controller..........");
        // 因为我设置了该不会被拦截器拦截，所以可以在这设置下Session的值，然后返回到登录页面中.
        session.setAttribute("loginname","张三");
        return "login";
    }
    @RequestMapping("/login")
    public String Upload(String username , String password) {
        if (username.equals("1151216441")&&password.equals("666666")){
            return "Success";
        }
        else {
            MyBusiness business = new MyBusiness("账号或者密码错误");
            throw  business;
        }
    }

    @RequestMapping("/Mulit")
    public String MulitUpload(HttpServletRequest request,MultipartFile Multfile,String des) throws IOException {
        String filename = Multfile.getOriginalFilename();
        String contextPath = request.getSession().getServletContext().getRealPath("/Upload");
        System.out.println("===============图片路劲："+contextPath);
        //拼接路径
        String pathname=contextPath+'/'+filename;
        File file = new File(pathname);
        Multfile.transferTo(file);
        return "MultSuccess";
    }
}
