package com.inheritance;

public class Rice {
    String color;
    double cost;
    String riceBrand;

    public Rice(String color, double cost, String riceBrand) {
        this.color = color;
        this.cost = cost;
        this.riceBrand = riceBrand;
    }

    @Override
    public String toString() {
        return "Rice{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                ", riceBrand='" + riceBrand + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 800;
    }
}
