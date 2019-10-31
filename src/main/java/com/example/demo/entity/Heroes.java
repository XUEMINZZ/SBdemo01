package com.example.demo.entity;

public class Heroes {
    private int id;
    private String title;
    private String name;
    private String types;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getTypes() { return types; }

    public void setTypes(String types) { this.types = types; }

    @Override
    public String toString() {
        return "Heroes{" +
                "id=" + id +
                ",title='" + title + '\'' +
                "name='" + name + '\'' +
                "types='" + types + '\'' +
                '}';
    }
}
