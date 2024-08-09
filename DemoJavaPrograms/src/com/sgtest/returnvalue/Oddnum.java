package com.sgtest.returnvalue;
class Odd
{
    int[] Num()
    {
        int a[]={9,7,5,3,1};
        return a;
    }
}
public class Oddnum {
    public static void main(String args[])
    {
        Odd o=new Odd();
        int s[]=o.Num();
        for(int val:s)
        {
            System.out.println(val);
        }
    }
}
