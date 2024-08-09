package com.sgtest.Methods;
class Double
{
    void display(double a[][])
    {
        int b[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                b[i][j]= (int) a[i][j];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class DoubleToInt {
    public static void main(String args[])
    {
        Double d=new Double();
        double a[][]={{2.1,3.3,4.7},{3.5,4.3,5.9},{5.4,6.7,8.9}};
        d.display(a);
    }
}
