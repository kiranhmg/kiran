package com.inheritance;

public class Seed {
    String seedName;
    String company;
    double cost;

    public Seed(String seedName, String company, double cost) {
        this.seedName = seedName;
        this.company = company;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Seed{" +
                "seedName='" + seedName + '\'' +
                ", company='" + company + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int hashCode() {
        return 600;
    }
}
