package com.example.demo.controller;

import com.example.demo.service.HeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lol")
public class HeroesController {
    @Autowired
    private HeroesService heroesService;
    @RequestMapping("heroes/{id}")
    public String getHeroes(@PathVariable int id){
        return  heroesService.selHero(id).toString();
    }
}
