package com.sgtest.Methods;
class Array2
{
    void Array2(int b[])
    {
        for(int i=0;i<b.length;i++){
         if((i==0)||(i==(b.length-1)))
         {
             System.out.print(b[i]+" ");
         }
        }
        System.out.println();
    }
}
public class Array1D {
    public static void main(String[] args)
    {
        Array2 p=new Array2();
        int b[]={1,2,3,4,5,7,8,9};
        p.Array2(b);
    }
}
