package com.sgtest.abstraction;
abstract class Addition
{
    static
    {
        int x=25;
        int y=25;
        int res=x+y;
        System.out.println("perform addition operations:"+res);
    }
}
class showaddition extends Addition
{
}
public class Demo3 {
    public static void main(String[] args)
    {
        showaddition a=new showaddition();
    }
}
