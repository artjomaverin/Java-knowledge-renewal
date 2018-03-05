package com.yolkin;

/**
 * Created by Admin on 23.01.2018.
 */
public class Player {
    private String name;
    private String age;

    public Player(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
