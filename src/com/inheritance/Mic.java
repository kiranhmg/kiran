package com.inheritance;

public class Mic {
    String brand;
    double cost;
    String soundQuality;

    public Mic(String brand, double cost, String soundQuality) {
        this.brand = brand;
        this.cost = cost;
        this.soundQuality = soundQuality;
    }



    @Override
    public String toString() {
        return "Mic{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                ", soundQuality='" + soundQuality + '\'' +
                '}';
    }
    public int hashCode()
    {
        return 400;
    }
}
