package com.sgtest.Methods;
class Maths1
{
    void display(byte a[])
    {
        int b[]=new int[a.length];
        for(byte i=0;i<a.length;i++) {
             b[i]=a[i];
            System.out.print(b[i] + " ");
        }
            System.out.println();
    }
}
public class ByteToInt {
    public static void main(String args[])
    {
        Maths1 m=new Maths1();
        byte a[]={1,2,3,4,5,6,7};
        m.display(a);
    }
}
