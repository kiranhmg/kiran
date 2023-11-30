package com.inheritance;

public class Cotton {
    String color;
    String quality;
    String cottonName;
    Cotton(String color,String quality,String cottonName)
    {
        this.color=color;
        this.quality=quality;
        this.cottonName=cottonName;
        System.out.println("invoking string,string,string const in Cotton");
    }
    public String toString() {

        return "Cotton info["+"color: "+this.color+" "+"quality: "+this.quality+" "+"cotton name: "+this.cottonName+"]";
    }
    public int hashCode()
    {
        return 300;
    }
}
