package com.tyro.libone;

import java.util.List;

import static java.util.Arrays.asList;

public class House {
    private Duck duck;
    private Chicken chicken;

    public House(Duck duck, Chicken chicken) {
        this.duck = duck;
        this.chicken = chicken;
    }

    public List<Animal> getAnimals() {
        return asList(duck, chicken);
    }
}
