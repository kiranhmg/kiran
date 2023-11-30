package com.inheritance;

public class Bandli {
    String type;
    double cost;
    String brand;

    public Bandli(String type, double cost, String brand) {
        this.type = type;
        this.cost = cost;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bandli{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 1500;
    }
}
