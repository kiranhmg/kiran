package com.xworkz;

public class GuitarStarter {
    public static void main(String[] args) {
        Guitar guitar=new Guitar(1,4000,"wood");
        Guitar guitar1=new Guitar(1,4000,"wood");
        guitar.equals(guitar1);

        Guitar guitar2=new Guitar(2,4000,"wood");
        Guitar guitar3=new Guitar(1,4000,"metal");
      guitar2.equals(guitar3);

        guitar2.equals(null);
        WifiDongal wifiDongal=new WifiDongal("jio",200,300);
       guitar2.equals(wifiDongal);


    }
}
