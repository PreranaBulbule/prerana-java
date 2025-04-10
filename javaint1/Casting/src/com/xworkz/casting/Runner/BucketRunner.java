package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket plasticBucket = new Bucket("Plastic", 20.0, 350.00);
        System.out.println(plasticBucket);
        System.out.println("Custom hashCode (overridden): " + plasticBucket.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(plasticBucket));
    }
}
