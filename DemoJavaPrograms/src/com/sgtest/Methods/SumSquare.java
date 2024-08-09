package com.sgtest.Methods;
class Sum
{
    void Sum()
    {
        int sum=0;
        for(int i=1;i<=10;i++) {
            int square = i * i;
            sum=sum+square;
        }
        System.out.println(sum+" ");
    }
}
public class SumSquare {
    public static void main(String args[])
    {
        Sum o=new Sum();
        o.Sum();
    }
}
