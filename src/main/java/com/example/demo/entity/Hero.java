package com.example.demo.entity;

public class Hero {
    private int id;
    private String title;
    private String heroName;
    private String profession;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getHeroName() { return heroName; }

    public void setHeroName(String heroName) { this.heroName = heroName; }

    public String getProfession() { return  profession; }

    public void setproPession(String profession) { this.profession = profession; }

    @Override
    public String toString() {
        return "Hero{" +
                "title='" + title + '\'' +
                "heroName='" + heroName + '\'' +
                "profession='" + profession + '\'' +
                '}'+"\n";
    }
}
