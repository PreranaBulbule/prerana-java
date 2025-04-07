package com.xworkz.Runner;
import com.xworkz.override22.Chalk;
import com.xworkz.override22.ChalkStore;
import com.xworkz.override22.WhiteChalk;

public class ChalkRunner {
    public static void main(String[] args) {
        Chalk chalk1 = new Chalk();
        chalk1.getMaterial();
        chalk1.getColor();
        chalk1.getSize();
        chalk1.getPrice();
        chalk1.getType();

        System.out.println("-------------------");
        Chalk chalk2 = new WhiteChalk();
        chalk2.getMaterial();
        chalk2.getColor();
        chalk2.getSize();
        chalk2.getPrice();
        chalk2.getType();

        System.out.println("-----------------");
        WhiteChalk whiteChalk = new WhiteChalk();
        whiteChalk.getMaterial();
        whiteChalk.getColor();
        whiteChalk.getSize();
        whiteChalk.getPrice();
        whiteChalk.getType();
        whiteChalk.getDustLevel();

        System.out.println("------------------");
        ChalkStore chalkStore = new ChalkStore();
        chalkStore.manage(chalk2);
        chalkStore.manage(chalk1);
        chalkStore.manage(whiteChalk);
    }
}
