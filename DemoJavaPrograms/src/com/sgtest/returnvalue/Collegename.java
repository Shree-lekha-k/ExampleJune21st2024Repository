package com.sgtest.returnvalue;
class College
{
    String Name(String name)
    {
        return name;
    }
}
public class Collegename {
    public static void main(String args[])
    {
        College c=new College();
        String name=c.Name("sree Venkateshwara college of Engineering");
        System.out.println(name);
    }
}
