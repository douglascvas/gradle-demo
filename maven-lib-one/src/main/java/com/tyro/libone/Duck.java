package com.tyro.libone;

public class Duck implements Animal {
    private String name;

    public Duck() {
    }

    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name + " b ";
    }

    public void setName(String id) {
        this.name = id;
    }
}
