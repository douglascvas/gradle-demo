package com.tyro.gradlelibone;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class CatTest {
    @Test
    public void shouldGetCatName() {
        Cat cat = new Cat();
        cat.setName("felix");

        assertThat(cat.getName(), containsString("felix"));
    }
}