package com.sgtest.constructorchaining;
class Maths1
{
    Maths1(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                int s=a[j][i];
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
public class Transpose{
    public static void main(String args[])
    {
        int x[][]={{200,30,40},{23,45,6},{45,76,88}};
        Maths1 o1=new Maths1(x);
    }
}
