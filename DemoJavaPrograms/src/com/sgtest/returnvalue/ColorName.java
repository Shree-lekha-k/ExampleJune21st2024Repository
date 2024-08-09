package com.sgtest.returnvalue;
class Color
{
    String Name(String name)
    {
        return name;
    }
}
public class ColorName {
    public static void main(String args[])
    {
        Color c=new Color();
        String name=c.Name("Green");
        System.out.println(name);
    }
}
