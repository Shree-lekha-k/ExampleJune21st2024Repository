package com.sgtest.returnvalue;
class Price
{
    int lap(int a)
    {
        return a;
    }
}
public class Pricelaptop {
    public static void main(String[] args)
    {
        Price p=new Price();
        int a=p.lap(10000);
        System.out.println(a);
    }
}
