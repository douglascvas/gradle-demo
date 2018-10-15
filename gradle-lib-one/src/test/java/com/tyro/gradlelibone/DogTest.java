package com.tyro.gradlelibone;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class DogTest {
    @Test
    public void shouldGetDogName() {
        Dog dog = new Dog();
        dog.setName("pluto");

        assertThat(dog.getName(), containsString("pluto"));
    }
}