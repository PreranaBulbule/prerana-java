package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Lock;

public class LockRunner {
    public static void main(String[] args) {
        Lock doorLock = new Lock("Steel", "Medium", 15.75);
        System.out.println(doorLock);
        System.out.println("Custom hashCode (overridden): " + doorLock.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(doorLock));

        Lock lock1 = new Lock("Steel", "Medium", 15.75);
        Lock lock2 = new Lock("Steel", "Medium", 15.75);
        boolean same = lock1.equals(lock2);
        System.out.println("Both locks are same: " + same);

        Lock lock3 = new Lock("Aluminum", "Large", 20.50);
        Lock lock4 = new Lock("Steel", "Small", 12.00);
        boolean different = lock3.equals(lock4);
        System.out.println("Both locks are same: " + different);
    }
}
