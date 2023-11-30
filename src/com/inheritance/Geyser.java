package com.inheritance;

public class Geyser {
    String brand;
    double cost;
    String type;

    public Geyser(String brand, double cost, String type) {
        this.brand = brand;
        this.cost = cost;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Geyser{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 1300;
    }
}
