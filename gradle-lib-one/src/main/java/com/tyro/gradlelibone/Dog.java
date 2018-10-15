package com.tyro.gradlelibone;

public class Dog implements Animal {
    private String name;

    public Dog() {
    }

    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String id) {
        this.name = id;
    }
}
