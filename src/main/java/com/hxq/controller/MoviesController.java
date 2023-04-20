package com.hxq.controller;

import com.hxq.pojo.*;
import com.hxq.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;
    Calendar instance = Calendar.getInstance();
    int m = instance.get(Calendar.MONTH);
    int y = instance.get(Calendar.DATE);

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public String selectDeatail(@PathVariable("id") Integer id, Model model) {
        List<Detail> details = moviesService.selectDetail(id);
        List<Director> directors = moviesService.selectDirector(id);
        List<Actor> actors = moviesService.selectActor(id);
        model.addAttribute("details",details);
        model.addAttribute("director",directors);
        model.addAttribute("actors",actors);
        return "detail";
    }

    @RequestMapping(value = "/selectcinema/{id}", method = RequestMethod.GET)
    public String selectCinema(@PathVariable("id") Integer id, Model model) {
        List<Detail> details = moviesService.selectDetail(id);
        List<Cinema> cinemas = moviesService.showcinema();
        model.addAttribute("m",m+1);
        model.addAttribute("y",y);
        model.addAttribute("details",details);
        model.addAttribute("cinemas",cinemas);
        return "selectcinema";
    }

    @RequestMapping(value = "/cinema/{id}", method = RequestMethod.GET)
    public String showCinema(@PathVariable("id") Integer id,Model model) {
        Cinema cinema = moviesService.selectcinema(id);
        List<Plist> list = moviesService.selectlist();
        model.addAttribute("m",m+1);
        model.addAttribute("y",y);
        model.addAttribute("cinema",cinema);
        model.addAttribute("list",list);
        model.addAttribute("id",id);
        return "cinema";
    }

    @RequestMapping(value="/buyseat/{id}",method = RequestMethod.GET)
    public String buySeat(@PathVariable("id") Integer id,Model model) {
        List<Plist> list = moviesService.selectlistById(id);
        List<Movies> movie = moviesService.getMovieById(1);
        model.addAttribute("list",list);
        model.addAttribute("movie",movie);
        model.addAttribute("m",m+1);
        model.addAttribute("y",y);
        model.addAttribute("id",id);
        return "buySeat";
    }

    @RequestMapping(value="/pay/{id}",method = RequestMethod.GET)
    public String pay(@PathVariable("id") Integer id,Model model) {
        List<Plist> list = moviesService.selectlistById(id);
        model.addAttribute("list",list);
        return "pay";
    }

    @RequestMapping(value="/buy")
    @ResponseBody
    public Orders success(@RequestBody Orders orders) {
        moviesService.addOrders(orders);
        return orders;
    }

    @RequestMapping(value="/success",method = RequestMethod.GET)
    public String success(){
        return "success";
    }
}
