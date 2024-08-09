package com.sgtest.polymorphism;
abstract class Maths
{
    abstract void add();
}
class Addition extends Maths{
    void add()
    {
        int a=10;
        int b=15;
        System.out.println("addition of two numbers:"+(a+b));
    }
}
class Addition1 extends Maths{
    void add()
    {
        int d=45;int e=23;int h=45;
        System.out.println("Addition of three num:"+(d+e+h));
    }
}
public class Demo1 {
    public static void main(String args[])
    {
        Maths maths=null;
        Addition add=new Addition();
        Addition1 add1=new Addition1();
        //add.add();
        //add1.add();
        maths=add;
        maths.add();
        maths=add1;
        maths.add();
    }
}
