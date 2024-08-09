package com.sgtest.polymorphism;
abstract class Mediaplayer{
    abstract void play();
}
class Audioplayer extends Mediaplayer
{
    void play(){
        System.out.println("Playing audio");
    }
}
class Videoplayer extends Mediaplayer{
    void play(){
        System.out.println("Playing video");
    }
}
public class Demo4 {
    public static void main(String args[])
    {
        Videoplayer video=new Videoplayer();
        video.play();
        Audioplayer audio=new Audioplayer();
        audio.play();
    }
}
