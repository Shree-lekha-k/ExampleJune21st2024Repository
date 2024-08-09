package com.sgtest.Methods;
class Array1{
    void Array1(int a[]) {
        int sum = 0;
        for (int j = 0; j < a.length / 2; j++) {
            sum = sum + a[j];
        }
        System.out.println("sum of 1st num:" + sum);
        int sum1=0;
        for (int i = a.length / 2; i< a.length; i++) {
            sum1 = sum1 + a[i];
        }
        System.out.println("sum of 2nd num: " + sum1);
        System.out.println(sum+sum1+" ");
    }
}
public class Array {
    public static void main(String args[]){
        Array1 o=new Array1();
        int a[]={1,2,3,5,6,7};
        o.Array1(a);
    }
}
