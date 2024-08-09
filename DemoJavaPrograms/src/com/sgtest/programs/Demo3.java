package com.sgtest.programs;
class Wheeler2 {
    String vehicletype;
    String brand;
    String model;
    int year;
}
class Wheeler4{
    String Vehicletype;
    String brand;
    String model;
    int year;
}
class HeavyVehicle{
    String Vehicletype;
    String brand;
    String model;
    int year;
}
public class Demo3{
    public static void main(String args[]) {
        Wheeler2 obj1 = new Wheeler2();
        obj1.vehicletype = "Bike";
        obj1.brand = "Honda";
        obj1.model="CBR 250R";
        obj1.year=2023;
        System.out.println("vehicletype: " + obj1.vehicletype);
        System.out.println("brand" + obj1.brand);
        System.out.println("model:"+obj1.model);
        System.out.println("year:"+obj1.year);
        System.out.println("+++++++++++++++++");
        Wheeler4 obj2 = new Wheeler4();
        obj2.Vehicletype = "Car";
        obj2.brand = "toyota";
        obj2.model="Camry";
        obj2.year=2022;
        System.out.println("Vehicletype:" + obj2.Vehicletype);
        System.out.println("brand:" + obj2.brand);
        System.out.println("model:"+obj2.model);
        System.out.println("year:"+obj2.year);
        System.out.println("+++++++++++++++");
        HeavyVehicle obj3 = new HeavyVehicle();
        obj3.Vehicletype = "Truck";
        obj3.brand = "Volvo";
        obj3.model="FR366";
        obj3.year=2020;
        System.out.println("Vehicletype:" + obj3.Vehicletype);
        System.out.println("brand:" + obj3.brand);
        System.out.println("model:"+obj3.model);
        System.out.println("year:"+obj3.year);
    }
}
