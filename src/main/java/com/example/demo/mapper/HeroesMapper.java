package com.example.demo.mapper;

import com.example.demo.entity.Hero;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroesMapper {
    Hero selHero(int id);
    Hero selHeroRandom(int id);
}
