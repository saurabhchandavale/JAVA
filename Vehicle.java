package p2;

import java.io.Serializable;

public class Vehicle implements Serializable {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
