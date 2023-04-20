package com.hxq.service;

import com.hxq.pojo.Advance;
import com.hxq.pojo.Movies;
import com.hxq.pojo.User;

import java.util.List;

public interface UserService {
    //判断是否存在该账号
    int selcetlogin(String phonenum);

    //添加用户
    void addUser(User user);

    //判断密码是否正确
    String selectpwd(String phonenum);

    List<Movies> getAllMovies();
//    List getAllMovies();

    List<Advance> getAllAdvance();

    List queryContent();
}
