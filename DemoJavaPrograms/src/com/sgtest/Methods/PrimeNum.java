package com.sgtest.Methods;

class Prime
{
    void Num()
    {
        int num=50;
        for(int i=1;i<=num;i++) {
            int a=0;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    a++;
                    break;
                }
            }
                if (a == 0) {
                    System.out.println(i);
            }
        }
    }
}
public class PrimeNum {
    public static void main(String[] args)
    {
        Prime p=new Prime();
        p.Num();
    }
}
