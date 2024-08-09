package com.sgtest.Methods;
class Factorial {
   void Factorial(int x) {
       int fact=1;
       for ( int i=1; i<=x; i++) {
           fact = fact*i;
       }
        System.out.println(fact+" ");
    }
}
public class FactorialDemo {
    public static void main(String[] args)
    {
        Factorial o=new Factorial();
        o.Factorial(4);
        o.Factorial(2);
    }
}
