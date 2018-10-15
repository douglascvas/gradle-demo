package com.tyro.gradlelibone;

import java.util.List;

import static java.util.Arrays.asList;

public class House {
    private Cat cat;
    private Dog dog;

    public House(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public List<Animal> getAnimals() {
        return asList(cat, dog);
    }
}
