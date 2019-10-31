package com.example.demo.mapper;

import com.example.demo.entity.Heroes;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroesMapper {
    Heroes selHero(int id);
}
