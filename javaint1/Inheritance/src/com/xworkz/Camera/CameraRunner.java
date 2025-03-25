package com.xworkz.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.setBrand("Canon");
        camera.setPrice(23000);
        camera.setType(CameraType.DSLR);
        camera.setConnectivity("WiFi");

        System.out.println("Camera Details:");
        System.out.println("Brand: " + camera.getBrand());
        System.out.println("Price: " + camera.getPrice());
        System.out.println("Type: " + camera.getType());
        System.out.println("Connectivity: " + camera.getConnectivity());

        CameraArray cameraArray=new CameraArray();
        cameraArray.Carry();

        CameraPara cameraPara=new CameraPara();
        UseParameter useParameter=new UseParameter();
        useParameter.lens(cameraPara);
    }
}
