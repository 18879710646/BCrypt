package com.org.Controller;

import com.org.PoJo.User;
import com.org.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

/**
 * @Author HP
 * @Date 2021/11/20 10:32
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@Controller
@RequestMapping("/accone")
public class AcconeController {
    @Autowired
    private Service service;
    @RequestMapping("/findall")
    public String FindAll(){
        List<User> users = service.FindAll();
        System.out.println(users);
        return "list";
    }

    @RequestMapping("/findall1")
    public String FindAll1(Model model){
        List<User> users = service.FindAll();
       model.addAttribute("list",users);
        return "list";
    }

    @RequestMapping("/bank")
    public String Bank(Model model){
        service.Bank("zs","ls",10);
        List<User> users = service.FindAll();
        model.addAttribute("bank",users);
        return "Bank";
    }
}
