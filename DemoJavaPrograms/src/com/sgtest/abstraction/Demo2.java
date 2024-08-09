package com.sgtest.abstraction;
abstract class Vehicle {
    {
        System.out.println("Vehicle name:");
    }
}
    class Wheeler extends Vehicle
    {
        void vehiclename(String name)
        {
            System.out.println(name+" ");
        }
    }

public class Demo2 {
    public static void main(String[] args) {
        Wheeler a=new Wheeler();
        a.vehiclename("Car");
    }
}
