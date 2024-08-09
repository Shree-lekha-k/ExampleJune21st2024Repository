package com.sgtest.programs;
class Wheeler2Args {
    String vehicletype;
    String brand;
    String model;
    int year;
    Wheeler2Args()
    {
        vehicletype = "Bike";
        brand = "Honda";
        model="CBR 250R";
        year=2023;
        System.out.println("vehicletype: " + vehicletype);
        System.out.println("brand" + brand);
        System.out.println("model:"+model);
        System.out.println("year:"+year);
        System.out.println("+++++++++++++++++");
    }
}
class Wheeler4Args{
    String Vehicletype;
    String brand;
    String model;
    int year;
    Wheeler4Args()
    {
        Vehicletype = "Car";
        brand = "toyota";
        model="Camry";
        year=2022;
        System.out.println("Vehicletype:" + Vehicletype);
        System.out.println("brand:" + brand);
        System.out.println("model:"+model);
        System.out.println("year:"+year);
        System.out.println("+++++++++++++++");
    }
}
class HeavyVehicleArgs{
    String Vehicletype;
    String brand;
    String model;
    int year;
    HeavyVehicleArgs()
    {
        Vehicletype = "Truck";
        brand = "Volvo";
        model="FR366";
        year=2020;
        System.out.println("Vehicletype:" + Vehicletype);
        System.out.println("brand:" + brand);
        System.out.println("model:"+model);
        System.out.println("year:"+year);
    }
}
public class ArgsDemo3 {
    public static void main(String[] args)
    {
        Wheeler2Args obj1=new Wheeler2Args();
        Wheeler4Args obj2=new Wheeler4Args();
        HeavyVehicleArgs obj3=new HeavyVehicleArgs();
    }
}
