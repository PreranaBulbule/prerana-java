package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket plasticBucket = new Bucket("Plastic", 20.0, 350.00);
        System.out.println(plasticBucket);
        System.out.println("Custom hashCode (overridden): " + plasticBucket.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(plasticBucket));

        Bucket bucket1 = new Bucket();
        bucket1.setMaterial("Plastic");

        Bucket bucket2 = new Bucket();
        bucket2.setMaterial("Plastic");

        boolean same = bucket1.equals(bucket2);
        System.out.println("Both same material: " + same);
    }
}

