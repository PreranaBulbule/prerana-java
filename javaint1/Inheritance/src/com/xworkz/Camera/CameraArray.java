package com.xworkz.Camera;

public class CameraArray {
    public void Carry(){
        Camera c1=new Camera();
        c1.setBrand("Canon");
        c1.setConnectivity("WIFI");
        c1.setType(CameraType.CCTV);
        c1.setPrice(30000);

        Camera c2=new Camera();
        c2.setBrand("Ambi");
        c2.setConnectivity("bluetooth");
        c2.setType(CameraType.MIRRORLESS);
        c2.setPrice(23000);

        System.out.println(c2.getBrand());
        System.out.println(c2.getConnectivity());
        System.out.println(c2.getPrice());
        System.out.println(c2.getType());
    }
}
