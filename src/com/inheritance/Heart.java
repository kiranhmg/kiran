package com.inheritance;

public class Heart {
    double size;
    double weight;
    String madeUp;

    public Heart(double size, double weight, String madeUp) {
        this.size = size;
        this.weight = weight;
        this.madeUp = madeUp;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "size=" + size +
                ", weight=" + weight +
                ", madeUp='" + madeUp + '\'' +
                '}';
    }
    public int hashCode()
    {
        return 500;
    }
}
