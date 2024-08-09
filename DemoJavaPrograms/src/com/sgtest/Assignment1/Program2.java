package com.sgtest.Assignment1;
class Nationalpark{
    String name;
    String location;
    int established_year;
    Nationalpark()
    {
        name="Bannerghatta National park";
        location="Bengaluru";
        established_year=1989;
        System.out.println("National park name:"+name);
        System.out.println("location:"+location);
        System.out.println("Established_year:"+established_year);
    }
}
class Wonderla{
    String name;
    String location;
    int Established_year;
    Wonderla()
    {
        name="Wonderla Amusement park";
        location="Bengaluru";
        Established_year=2011;
        System.out.println("Wonderla name:"+name);
        System.out.println("location:"+location);
        System.out.println("Established year:"+Established_year);
    }
}

public class Program2 {
    public static void main(String[] args)
    {
        Nationalpark obj1=new Nationalpark();
        Wonderla obj2=new Wonderla();
    }
}
