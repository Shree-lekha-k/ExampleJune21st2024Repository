package com.sgtest.factorial;

public class Factnum {
    public static void main(String[] args) {
        num(5);
    }
    static void num(int num)
    {
        int fact=1;
        for(int i=2;i<=num;i++)
        {
           fact=fact*i;
        }
        System.out.println(fact+" ");
    }
}
