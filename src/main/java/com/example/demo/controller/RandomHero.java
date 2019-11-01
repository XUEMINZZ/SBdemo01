package com.example.demo.controller;

import java.util.Iterator;

import com.example.demo.entity.Hero;
import com.example.demo.service.HeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/random")
public class RandomHero {
    @Autowired
    HeroesService heroesServiceR;

    @RequestMapping("hero")
    public Hero[] getRandomHero() {
        Random ran = new Random();
        Set<Integer> set = new HashSet<Integer>();
        while (set.size() !=5) {
            int i = ran.nextInt(40) + 1;
            set.add(i);
        }
        Iterator<Integer> it = set.iterator();
       Hero[] heroID = new Hero[set.size()];

           for (int i = 0; i < set.size() ; i++) {
               heroID[i] = heroesServiceR.selHeroRandom(it.next());
           }

        return  heroID;
    }

}
