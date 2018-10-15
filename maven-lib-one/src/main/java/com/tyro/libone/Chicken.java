package com.tyro.libone;

public class Chicken implements Animal {
    private String name;

    public Chicken() {
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
