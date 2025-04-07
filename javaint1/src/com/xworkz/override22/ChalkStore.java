package com.xworkz.override22;

public class ChalkStore {
    public void manage(Chalk chalk) {
        chalk.getMaterial();
        chalk.getColor();
        chalk.getSize();
        chalk.getPrice();
        chalk.getType();

        if (chalk instanceof WhiteChalk) {
            System.out.println("Chalk is instance of WhiteChalk");
            WhiteChalk whiteChalk = (WhiteChalk) chalk;
            whiteChalk.getDustLevel();
        }
    }
}

