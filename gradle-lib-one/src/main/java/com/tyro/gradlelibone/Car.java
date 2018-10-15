package com.tyro.gradlelibone;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {

    @NotNull
    private String manufacturer;

    @NotNull
    @Size(min = 2, max = 14)
    private String licensePlate;

    @Range(min = 1, max = 200)
    private int seatCount;

    public Car(String manufacturer, String licencePlate, int seatCount) {
        this.manufacturer = manufacturer;
        this.licensePlate = licencePlate;
        this.seatCount = seatCount;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getSeatCount() {
        return seatCount;
    }
}
