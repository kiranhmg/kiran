package com.inheritance;

public class Spoon {
    int size;
    double cost;
    String type;

    public Spoon(int size, double cost, String type) {
        this.size = size;
        this.cost = cost;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Spoon{" +
                "size=" + size +
                ", cost=" + cost +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 1100;
    }
}
