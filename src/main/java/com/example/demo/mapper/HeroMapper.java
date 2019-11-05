package com.example.demo.mapper;

import com.example.demo.entity.Hero;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroMapper {
    Hero selHero(int id);
    List<Hero> selHeroRandom(List id);
}
