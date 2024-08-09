package com.sgtest.constructorchaining;
class Maths
{
    Maths(int a[][],int b[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                int s=a[i][j]-b[i][j];
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
public class Substract{
    public static void main(String args[])
    {
        int x[][]={{200,30,40},{23,45,6},{45,76,88}};
        int y[][]={{65,15,35},{8,16,3},{44,67,56}};
            Maths o1=new Maths(x,y);
        }
    }
