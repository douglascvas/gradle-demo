package com.tyro.gradlelibtwo;

import com.tyro.gradlelibone.Car;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class CarValidator {

    public static Set<ConstraintViolation<Car>> validate(Car car) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        return validator.validate(car);
    }
}
