package com.xworkz.Camera;
enum CameraType { DSLR, MIRRORLESS, CCTV }

public class Camera {
    private String brand;
    private int price;
    private CameraType type;
    private String connectivity;

    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    public String getConnectivity() {
        return this.connectivity;
    }

    public CameraType getType() {
        return this.type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(CameraType type) {
        this.type = type;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

}
