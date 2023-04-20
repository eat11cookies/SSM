package com.hxq.mapper;

import com.hxq.pojo.*;

import java.util.List;

public interface MoviesMapper {

    List<Detail> selectDetail(Integer id);

    List<Director> selectDirector(Integer id);

    List<Actor> selectActor(Integer id);

    List<Cinema> showcinema();

    Cinema selectcinema(Integer id);

    List queryContent();

    List<Plist> selectlist();

    List<Plist> selectlistById(Integer id);

    List<Movies> getMovieById(Integer id);

    void addOrders(Orders orders);
}
