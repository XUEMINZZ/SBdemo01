package com.example.demo.service;

import com.example.demo.entity.Heroes;
import com.example.demo.mapper.HeroesMapper;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroesService {
    @Autowired
     HeroesMapper heroesMapper;
    public Heroes selHero(int id){
        return heroesMapper.selHero(id);
    }
}
