package com.tyro.gradlelibone;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HouseTest {
    @Test
    public void shouldCreateHouse() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        House house = new House(cat, dog);

        assertThat(house.getAnimals().size(), is(2));
    }
}