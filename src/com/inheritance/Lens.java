package com.inheritance;

public class Lens {
    double cost;
    public String brand;
    public String color;
    public Lens(double cost,String brand,String color)
    {
        this.cost=cost;
        this.brand=brand;
        this.color=color;
        System.out.println("invoking double,string, string const in Lens");
    }

    @Override
    public String toString() {

        return "lens info["+"color: "+this.color+" "+"brand: "+this.brand+" "+"cost: "+this.cost+"]";
    }

    @Override
    public int hashCode()
    {
        return 100;
    }
}
