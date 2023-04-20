package com.hxq.service.impl;

import com.hxq.mapper.MoviesMapper;
import com.hxq.pojo.*;
import com.hxq.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    private MoviesMapper moviesMapper;


    @Override
    public List<Detail> selectDetail(Integer id) {
        return moviesMapper.selectDetail(id);
    }

    @Override
    public List<Director> selectDirector(Integer id) {
        return moviesMapper.selectDirector(id);
    }

    @Override
    public List<Actor> selectActor(Integer id) {
        return moviesMapper.selectActor(id);
    }

    @Override
    public List<Cinema> showcinema() {
        return moviesMapper.showcinema();
    }

    @Override
    public Cinema selectcinema(Integer id) {
        return moviesMapper.selectcinema(id);
    }

    @Override
    public List queryContent() {
        return moviesMapper.queryContent();
    }

    @Override
    public List<Plist> selectlist() {
        return moviesMapper.selectlist();
    }

    @Override
    public List<Plist> selectlistById(Integer id) {
        return moviesMapper.selectlistById(id);
    }

    @Override
    public List<Movies> getMovieById(Integer id) {
        return moviesMapper.getMovieById(id);
    }

    @Override
    public void addOrders(Orders orders) {
        moviesMapper.addOrders(orders);
    }
}
