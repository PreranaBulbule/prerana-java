package com.xworkz.Runner;
import com.xworkz.override5.Bucket;
import com.xworkz.override5.BucketContainer;
import com.xworkz.override5.PlasticBucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket1 = new Bucket();
        bucket1.getMaterial();
        bucket1.getSize();
        bucket1.getColor();
        bucket1.getShape();
        bucket1.getPrice();

        System.out.println("-------------------");
        Bucket bucket2 = new PlasticBucket();
        bucket2.getMaterial();
        bucket2.getSize();
        bucket2.getColor();
        bucket2.getShape();
        bucket2.getPrice();

        System.out.println("-----------------");
        PlasticBucket plasticBucket = new PlasticBucket();
        plasticBucket.getMaterial();
        plasticBucket.getSize();
        plasticBucket.getColor();
        plasticBucket.getShape();
        plasticBucket.getPrice();
        plasticBucket.handle();

        System.out.println("------------------");
        BucketContainer bucketContainer = new BucketContainer();
        bucketContainer.manage(bucket2);
        bucketContainer.manage(bucket1);
        bucketContainer.manage(plasticBucket);
    }
}
