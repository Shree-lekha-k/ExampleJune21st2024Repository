package com.sgtest.abstraction;
abstract  class Arithmetic
{
        Arithmetic(int x,int y)
        {
            int res=x+y;
            System.out.println("addition of two num:"+res);
        }
        Arithmetic(int a, int b, int c)
        {
            int d=(a-b)-c;
            System.out.println("Subtraction of two num:"+d);
        }
        Arithmetic(int s,int t,int d,int e)
    {
        int f=(s-t)*(d+e);
        System.out.println("Result:"+f);
    }
}
class Arithmetic1 extends Arithmetic
{
     Arithmetic1(int x,int y )
    {
       super( x,y);
    }
    Arithmetic1(int a,int b,int c)
    {
        super(a,b,c);
    }
    Arithmetic1(int s,int t,int d,int e)
    {
        super(s,t,d,e);
    }
}
public class Demo4 {
    public static void main(String args[])
    {
        Arithmetic1 s=new Arithmetic1(4,5);
        Arithmetic1 c=new Arithmetic1(45,23,5);
        Arithmetic1 e=new Arithmetic1(25,45,56,67);

    }
}
