package com.xworkz;

public class UsbStarter {
    public static void main(String[] args) {
        UsbHub usbHub=new UsbHub(4,400,2);
        UsbHub usbHub1=new UsbHub(4,400,2);
        UsbHub usbHub2=new UsbHub(4,400,3);
        usbHub.equals(usbHub1);
        usbHub1.equals(usbHub2);
        usbHub2.equals(null);
        WifiDongal wifiDongal=new WifiDongal("jio",200,300);
          usbHub2.equals(wifiDongal);

    }
}
