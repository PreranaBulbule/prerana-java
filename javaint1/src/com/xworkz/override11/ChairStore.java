package com.xworkz.override11;

public class ChairStore {
    public void manage(Chair chair) {
        chair.getMaterial();
        chair.getType();
        chair.getColor();
        chair.getPrice();
        chair.getWeight();

        if (chair instanceof OfficeChair) {
            System.out.println("Chair is instance of OfficeChair");
            OfficeChair officeChair = (OfficeChair) chair;
            officeChair.adjustHeight();
        }
    }
}

