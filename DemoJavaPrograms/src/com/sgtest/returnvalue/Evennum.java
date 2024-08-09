package com.sgtest.returnvalue;
class Even
{
    int[] Num()
    {

        int b[]={10,12,14,16,18,20};
        return b;
    }
}
public class Evennum {
    public static void main(String args[])
    {
        Even e=new Even();
        int d[]=e.Num();
        for(int val:d)
        {
            System.out.println(val);
        }
    }
}
