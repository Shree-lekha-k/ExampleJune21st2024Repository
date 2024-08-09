package com.sgtest.returnvalue;

class Dish
{
    String[] getitem()
    {
        String s[]={"palav","Idly","Dosa"};
        return s;
    }
}
public class Dishitem {
    public static void main(String args[])
    {
        Dish d=new Dish();
        String  Dish[]=d.getitem();
        for(String val:Dish)
        {
            System.out.println(val);
        }
    }
}
