package com.sgtest.Assignment1;
class Restaurant{
    String Restaurant_name;
    String Restaurant_Address;
    String Restaurant_ownername;
    int Restaurant_phoneno;
    Restaurant()
    {
        Restaurant_name = "Meghana";
        Restaurant_Address = "Bengaluru";
        Restaurant_ownername = "Tejasree";
        Restaurant_phoneno = 767578777;
        System.out.println("Restaurant_name:" + Restaurant_name);
        System.out.println("Restaurant_Address:" + Restaurant_Address);
        System.out.println("Restuarant_ownername:" + Restaurant_ownername);
        System.out.println("Restaurant_phoneno:" + Restaurant_phoneno);
    }
}
class Fooddelivery{
    String appname;
    String Hotelname;
    String location;
    int mobno;
    Fooddelivery()
    {
        appname="Zomato";
        Hotelname="udupi";
        location="Vijayanagar";
        mobno=458758887;
        System.out.println("appname:"+appname);
        System.out.println("Hotelname:"+Hotelname);
        System.out.println("Location:"+location);
        System.out.println("mobno:"+mobno);
    }
}

public class Program1 {
    public static void main(String[] args)
    {
        Restaurant obj1=new Restaurant();
        Fooddelivery obj2=new Fooddelivery();
    }
}
