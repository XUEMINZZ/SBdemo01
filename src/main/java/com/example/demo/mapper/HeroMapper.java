package com.example.demo.mapper;

import com.example.demo.entity.Hero;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroMapper {
    Hero selHero(int id);
    Hero selHeroRandom(int id);
}
