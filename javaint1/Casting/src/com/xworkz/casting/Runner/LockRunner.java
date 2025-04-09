package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Lock;

public class LockRunner {
    public static void main(String[] args) {
        Lock doorLock = new Lock("Steel", "Medium", 15.75);
        System.out.println(doorLock);
    }
}
