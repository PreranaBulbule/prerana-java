package com.xworkz.Alien;

public class Alien {
    private String seenby;
    private String seenDate;
    private String describe;

    public Alien(){
        System.out.println("running Alien in constructor");
    }
    public String getSeenby(){
        return this.seenby;
    }
    public String getSeenDate(){
        return this.seenDate;
    }
    public String getDescribe(){
        return this.describe;
    }

    public void setSeenby(String seenby){
        this.seenby=seenby;
    }
    public void setSeenDate(String seenDate){
        this.seenDate=seenDate;
    }
    public void setDescribe(String describe){
        this.describe=describe;
    }
}
