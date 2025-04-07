package com.xworkz.Runner;
import com.xworkz.override7.Lense;
import com.xworkz.override7.LenseStore;
import com.xworkz.override7.ContactLense;

public class LenseRunner {
    public static void main(String[] args) {
        Lense lense1 = new Lense();
        lense1.getType();
        lense1.getColor();
        lense1.getSize();
        lense1.getMaterial();
        lense1.getPrice();

        System.out.println("-------------------");
        Lense lense2 = new ContactLense();
        lense2.getType();
        lense2.getColor();
        lense2.getSize();
        lense2.getMaterial();
        lense2.getPrice();

        System.out.println("-----------------");
        ContactLense contactLense = new ContactLense();
        contactLense.getType();
        contactLense.getColor();
        contactLense.getSize();
        contactLense.getMaterial();
        contactLense.getPrice();
        contactLense.getUVProtection();

        System.out.println("------------------");
        LenseStore lenseStore = new LenseStore();
        lenseStore.manage(lense2);
        lenseStore.manage(lense1);
        lenseStore.manage(contactLense);
    }
}
