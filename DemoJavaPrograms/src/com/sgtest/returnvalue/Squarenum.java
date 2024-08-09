package com.sgtest.returnvalue;
class Numb
{
    int getsquarenum(int num)
    {
        int n=num*num;
        return n;
    }
}
public class Squarenum {
    public static void main(String[] args)
    {
        Numb a=new Numb();
        int c=a.getsquarenum(4);
        System.out.println(c);
    }
}
