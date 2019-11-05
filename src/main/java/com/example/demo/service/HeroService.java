package com.example.demo.service;

import com.example.demo.entity.Hero;
import com.example.demo.mapper.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {
    @Autowired
    HeroMapper heroMapper;
    @Autowired
    HeroMapper heroMapperR;
    public Hero selHero(int id){
        return heroMapper.selHero(id);
    }

    public List<Hero> selHeroRandom(List<Integer> idList){
        return heroMapperR.selHeroRandom(idList);
    }
}
