package com.inheritance;

public class Bowl {
    String type;
    double cost;
    double volume;

    public Bowl(String type, double cost, double volume) {
        this.type = type;
        this.cost = cost;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", volume=" + volume +
                '}';
    }

    @Override
    public int hashCode() {
        return 1000;
    }
}
