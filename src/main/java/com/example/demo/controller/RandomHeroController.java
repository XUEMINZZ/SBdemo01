package com.example.demo.controller;

import java.util.Iterator;


import com.example.demo.entity.Hero;
import com.example.demo.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/random")
public class RandomHeroController {
    @Autowired
    HeroService heroServiceR;

    @RequestMapping("hero")
    public List<Hero> getRandomHero() {
        Random ran = new Random();
        Set<Integer> set = new HashSet<Integer>();
        while (set.size() != 5) {
            int i = ran.nextInt(40) + 1;
            set.add(i);
        }
        List<Integer>idList=new ArrayList<>(set);

        return heroServiceR.selHeroRandom(idList);





    }


}
