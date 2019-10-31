package com.example.demo.entity;

public class User{
    private int id;
    private int age;
    private String name;
    private String tel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString(){
        return "User{"+
                "id="+id +
                ",name='"+name+'\''+
                "age='"+age+'\''+
                "tel='"+tel+'\''+
                '}';
    }
}
