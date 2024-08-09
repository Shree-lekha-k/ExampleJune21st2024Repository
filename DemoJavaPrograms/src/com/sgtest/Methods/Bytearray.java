package com.sgtest.Methods;

class Testing
{
    void findFact(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact+" ");
    }
}
 public class Bytearray{
     public static void main(String args[])
     {
         Testing o=new Testing();
         o.findFact(4);
         o.findFact(5);
         o.findFact(3);
     }

 }
