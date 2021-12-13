package com.itheima.Controller;

import com.itheima.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Acc")
// @ResponseController表示为Controller+Responsebody,表示的是所有的方法都返回json的数据类型.
// 而Controller表示的是显示的为返回的默认的请求转发的页面形式
public class SpringController {
    @RequestMapping("/add")
    // @RequestParam 用于请求Get中的参数，在进行复制操作到定义的String name ,int age中
    public String  add(@RequestParam String name, int age){
        System.out.println("进入到Controller中");
        System.out.println("name="+name+"age="+age);
        return "success";
    }
    // 如果在页面中定义的name的名称和接口中定义的名称相同是可以直接获取到值的，但是如果在前端页面中，定义的值和接口中的不同，那么将会获取不到
    //需要添加上@Resquestbody才能对值进行获取
    @RequestMapping("/update")
    public String update( User user){
        System.out.println("更新的数据是："+user);
        return "success";
    }
    // 展示出在前端页面中定义的name和接口参数名称中不同时，使用@Requestbody进行获取操作
    @RequestMapping("/addupdate")
    public String addupadte(@RequestBody String quest){
        System.out.println("quest="+quest);
        return "success";
    }

    // @PathVariable是用来占位的，获取到链接中的数值
    @RequestMapping("/pathvariable/{id}")
    public String pathVar(@PathVariable(value = "id") int id){
        System.out.println("获取到的ID值="+id);
        return "success";
    }

    // 获取到当前页面的请求头
    @RequestMapping("/head")
    public String head(@RequestHeader(value = "User-agent") String head){
        System.out.println("当前页面中的请求头是+User-agent"+head);
        return "success";
    }
    //获取到当前页面中的Cookies
    @RequestMapping("/cookies")
    public String Cookies(@CookieValue(value = "JSESSIONID") String sessionId) {
        System.out.println("获取到Cookies=" + sessionId);
        return "success";
    }
        //重定向
     @RequestMapping("/redict")
     public String redic(){
            System.out.println("现在显示的是重定向");
            return "redirect:/page/success";

     }
    //请求转发(默认的就是请求转发)
    @RequestMapping("/forwar")
    public String  forwarText(){
        System.out.println("现在的是请求转发");
        return "success";
    }
    //现在的是请求转发到外部网站中
    @RequestMapping("/redirectText")
    public String  RedirectText(){
        System.out.println("现在的是重定向到外网中");
        return "redirect:http://www.baidu.com";
    }

    //现在的是重定向到方法中去
    @RequestMapping("/redirectText1")
    public String RedirectText1(){
        System.out.println("现在开始的是重定向到方法中");
        return  "redirect:Text";
    }
    //重定向到方法测试
    @RequestMapping("/Text")
    public String Test(){
        System.out.println("进入到测试页面中");
        return "";
    }
    //返回json数据返回到前端中
    //加上的@Responsebody的意思是表示为向前段返回json数据，但是在添加@Responsebody的时候要在依赖中加上fackjson的依赖
    //因为在Springmvc中默认的是jackjsonjin进行数据转化操作的，所以要在依赖中添加上jackjson的依赖
    //方法中返回的数据也是json类型的。
    //@ResponseBody如果是加载类上，那么显示的是所以有的方法都返回的是Json的数据形式.
    @RequestMapping("/json")
    public @ResponseBody User JsonTest(){
        User user=new User();
        System.out.println("进入到Json中"+user);
        user.setName("郑建成");
        return user;
    }






































}
