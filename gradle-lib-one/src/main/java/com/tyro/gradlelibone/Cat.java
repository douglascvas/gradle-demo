package com.tyro.gradlelibone;

public class Cat implements Animal {
    private String name;

    public Cat() {
    }

    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name + " v ";
    }

    public void setName(String id) {
        this.name = id;
    }
}
