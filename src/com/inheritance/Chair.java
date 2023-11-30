package com.inheritance;

public class Chair {
    double cost;
    String color;
    String type;

    public Chair(double cost, String color, String type) {
        this.cost = cost;
        this.color = color;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Chair{" +
                "cost=" + cost +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 700;
    }
}
