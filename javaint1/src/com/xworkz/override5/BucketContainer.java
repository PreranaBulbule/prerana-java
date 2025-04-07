package com.xworkz.override5;

public class BucketContainer {
    public void manage(Bucket bucket) {
        bucket.getMaterial();
        bucket.getSize();
        bucket.getColor();
        bucket.getShape();
        bucket.getPrice();

        if(bucket instanceof PlasticBucket) {
            System.out.println("Bucket is instance of PlasticBucket");
            PlasticBucket plasticBucket = (PlasticBucket) bucket;
            plasticBucket.handle();
        }
    }
}

