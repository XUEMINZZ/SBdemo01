package com.example.demo.service;

import com.example.demo.entity.Hero;
import com.example.demo.mapper.HeroesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroesService {
    @Autowired
    HeroesMapper heroesMapper;
    @Autowired
    HeroesMapper heroesMapperR;
    public Hero selHero(int id){
        return heroesMapper.selHero(id);
    }

    public Hero selHeroRandom(int id){
        return heroesMapperR.selHeroRandom(id);
    }
}
