package com.sgtest.returnvalue;
class Country
{
    String name(String a)
    {
        return a;
    }
}
public class Countryname {
    public static void main(String args[])
    {
        Country c=new Country();
        String a=c.name("India");
        System.out.println(a);
    }
}
