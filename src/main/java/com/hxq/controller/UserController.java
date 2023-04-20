package com.hxq.controller;


import com.hxq.pojo.Advance;
import com.hxq.pojo.Movies;
import com.hxq.pojo.User;
import com.hxq.service.MoviesService;
import com.hxq.service.UserService;
import com.hxq.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private MoviesService moviesService;
    String text=null;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user, Model model) {
        if(user.getPhonenum()==null||user.getPassword()==null){
            text="账号，密码不能为空";
            model.addAttribute("text", text);
            return "login";
        }
     if(userService.selcetlogin(user.getPhonenum())==0){
         user.setPassword(MD5Utils.md5(user.getPassword()));
         userService.addUser(user);
     }else{
         while(!MD5Utils.md5(user.getPassword()).equals(userService.selectpwd(user.getPhonenum()))){
             text="账号或密码错误";
             model.addAttribute("text", text);
             return "login";
         }
     }
     List<Movies> list = userService.getAllMovies();
     List<Advance> advance = userService.getAllAdvance();
     model.addAttribute("list",list);
     model.addAttribute("advance",advance);
     return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String relogin(Model model){
        model.addAttribute("text",text);
        return "login";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        List<Movies> list = userService.getAllMovies();
        model.addAttribute("list",list);
        List<Advance> advance = userService.getAllAdvance();
        model.addAttribute("advance",advance);
        return "index";
    }

    @RequestMapping("/allusers")
    @ResponseBody
    public List queryUsers() {
        List list = userService.getAllMovies();
        return list;
    }
}
