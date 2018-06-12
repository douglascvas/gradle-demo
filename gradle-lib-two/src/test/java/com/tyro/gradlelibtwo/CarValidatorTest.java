package com.tyro.gradlelibtwo;

import com.tyro.gradlelibone.Car;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CarValidatorTest {

    @Test
    public void shouldFailIfLicencePlateSizeIsTooShort() {
        Bmw bmw = new Bmw("i8-1234", 2018, "bmw", "D", 4);

        Set<ConstraintViolation<Car>> constraintViolations = CarValidator.validate(bmw);

        assertEquals(1, constraintViolations.size());
        assertEquals("size must be between 2 and 14", constraintViolations.iterator().next().getMessage());
    }

    @Test
    public void shouldFailIfModelSizeIsTooShort() {
        Car car = new Bmw("i8", 2018, "Morris", "DD-AB-123", 4);

        Set<ConstraintViolation<Car>> constraintViolations = CarValidator.validate(car);

        assertEquals(1, constraintViolations.size());
        assertEquals("size must be between 5 and 10", constraintViolations.iterator().next().getMessage());
    }
}