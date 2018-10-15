package com.tyro.mavenlibtwo;

import com.tyro.libone.Car;
import org.hibernate.validator.constraints.Range;
//import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Size;

public class Bmw extends Car {

    @Size(min = 5, max = 10)
    private String model;

    @Range(min = 2000, max = 2018)
    private int year;

    public Bmw(String model, int year, String manufacturer, String licencePlate, int seatCount) {
        super(manufacturer, licencePlate, seatCount);
        this.year = year;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
