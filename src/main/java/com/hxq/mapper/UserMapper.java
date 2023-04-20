package com.hxq.mapper;

import com.hxq.pojo.Advance;
import com.hxq.pojo.Movies;
import com.hxq.pojo.User;

import java.util.List;

public interface UserMapper {

    Integer selectlogin(String phonenum);

    void addUser(User  user);

    String selectpwd(String phonenum);

    List<Movies> getAllMovies();

    List<Advance> getAllAdvance();

    List queryContent();
}
