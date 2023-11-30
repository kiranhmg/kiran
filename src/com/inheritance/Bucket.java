package com.inheritance;

public class Bucket {
    int height;
    double volume;
    String color;

    public Bucket(int height, double volume, String color) {
        this.height = height;
        this.volume = volume;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "height=" + height +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 900;
    }
}
