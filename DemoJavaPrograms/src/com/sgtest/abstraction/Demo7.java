package com.sgtest.abstraction;
abstract class Maths
{
    void add(int a,int b){
        int res=a+b;
        System.out.println("addition:"+res);
    }
}
class Maths1 extends Maths
{
    void sub(int x,int y)
    {
        int z=x-y;
        System.out.println("Subtraction:"+z);
    }
}
class Maths2 extends Maths
{
    void mul(int d,int e)
    {
        int f=d*e;
        System.out.println("Multiplication:"+f);
    }
}
class Maths3 extends Maths2
{
    void Div(int s, int t)
    {
        int k=s/t;
        System.out.println("Division:"+k);
    }
}
public class Demo7 {
    public static void main(String args[])
    {
        Maths1 m1=new Maths1();
        m1.add(45,56);
        m1.sub(34,12);
        Maths3 m=new Maths3();
        m.add(45,12);
        m.mul(6,8);
        m.Div(12,4);

    }
}
