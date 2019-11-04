package com.example.demo.service;

import com.example.demo.entity.Hero;
import com.example.demo.mapper.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService {
    @Autowired
    HeroMapper heroMapper;
    @Autowired
    HeroMapper heroMapperR;
    public Hero selHero(int id){
        return heroMapper.selHero(id);
    }

    public Hero selHeroRandom(int id){
        return heroMapperR.selHeroRandom(id);
    }
}
