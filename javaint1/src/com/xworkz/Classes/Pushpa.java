package com.xworkz.Classes;

public class Pushpa {
    Clip[] clips;

    public Pushpa(Clip[] clips){
        this.clips = clips;
    }
    void useClip(Clip[] clips){
        for(Clip clip : clips){
            if(clip != null){
                System.out.println("Clip color : "+clip.color);
                clip.hold();
            }
            else{
                System.err.println("The value of clip is null");
            }
        }
    }
}