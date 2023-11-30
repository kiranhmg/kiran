package com.inheritance;

public class Locker {
    public double cost;
    public String company;
    public boolean isSecure;
    public Locker(double cost,String company,boolean isSecure)
    {
       this.cost=cost;
       this.company=company;
       this.isSecure=isSecure;
        System.out.println("invoking double,string,boolean const in Locker");
    }
    public String toString() {

        return "Locker info["+"cost: "+this.cost+" "+"company: "+this.company+" "+"isSecure: "+this.isSecure+"]";
    }
    public int hashCode()
    {
        return 200;
    }

}
