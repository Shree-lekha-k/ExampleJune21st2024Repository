package com.sgtest.polymorphism;
abstract class Vehicle
{
    abstract void speed();
}
class Car extends Vehicle
{
    void speed()
    {
        double dist=150;
        double time=1.5;
        System.out.println("speed of car:"+(dist/time));
    }
}
class Bike extends Vehicle
{
    void speed()
    {
        double dist=250;
        double time=2;
        System.out.println("Speed of bike:"+(dist/time));
    }
}
public class Demo2 {
    public static void main(String args[])
    {
        Bike bike=new Bike();
        Car car=new Car();
        bike.speed();
        car.speed();
    }
}
