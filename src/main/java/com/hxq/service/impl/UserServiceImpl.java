package com.hxq.service.impl;

import com.hxq.mapper.UserMapper;
import com.hxq.pojo.Advance;
import com.hxq.pojo.Movies;
import com.hxq.pojo.User;
import com.hxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //判断是否存在该账号
    @Override
    public int selcetlogin(String phonenum) {
        return userMapper.selectlogin(phonenum);
    }

//    添加新用户
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    //判断密码是否正确
    @Override
    public String selectpwd(String phonenum) {
        return userMapper.selectpwd(phonenum);
    }

    @Override
    public List<Movies> getAllMovies() {
        return userMapper.getAllMovies();
    }

    @Override
    public List<Advance> getAllAdvance() {
        return userMapper.getAllAdvance();
    }

    @Override
    public List queryContent() {
        return userMapper.queryContent();
    }
}
