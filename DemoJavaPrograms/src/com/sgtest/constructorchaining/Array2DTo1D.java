package com.sgtest.constructorchaining;
class Maths6
{
    Maths6(int x[][])
    {
        int row=x.length;
        int col=x[0].length;
        int[] d=new int[row*col];
        int k=0;
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x.length;j++)
            {
                d[k]=x[i][j];
                k++;
            }
        }
        for(int i=0;i<d.length;i++)
        {
            System.out.println(d[i]+" ");
        }
    }
}
public class Array2DTo1D {
    public static void main(String[] args)
    {
        int s[][]={{23,45,67},{12,13,14},{21,22,23}};
        Maths6 o1=new Maths6(s);
    }
}
