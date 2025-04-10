package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Lock;

public class LockRunner {
    public static void main(String[] args) {
        Lock doorLock = new Lock("Steel", "Medium", 15.75);
        System.out.println(doorLock);
        System.out.println("Custom hashCode (overridden): " + doorLock.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(doorLock));
    }
}

