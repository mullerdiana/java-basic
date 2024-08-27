package edu.diana.secondweek;

public class SmartTv {
    boolean on=false;
    int channel=1;
    int volume=25;

    public void turnOn(){
        on=true;
    }
    public void turnOff(){
        on=false;
    }
   
    public void raiseVolume(){
        volume++;
    }
    public void decreaseVolume(){
        volume--;
    }
    public void changeChannel(int newChannel){
        channel= newChannel;
    }
}
