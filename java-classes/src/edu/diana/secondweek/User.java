package edu.diana.secondweek;

public class User {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();


        smartTv.turnOn();
        smartTv.turnOff();
        smartTv.raiseVolume();
        smartTv.decreaseVolume();
        smartTv.turnOff();
        System.out.println("Canal atual: " + smartTv.channel);
        smartTv.changeChannel(13);

        System.out.println("Tv Ligada? " + smartTv.on);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
