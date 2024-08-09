package com.sgtest.returnvalue;
class Matrix
{
    int[][] Add(int a[][],int b[][])
    {
        int res[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        return res;
    }
}
public class Addmatrix {
    public static void main(String[] args)
    {
        Matrix m=new Matrix();
        int a[][]={{1,2},{4,5}};
        int b[][]={{2,3},{5,6}};
        int z[][]=m.Add(a,b);
        for(int[]val:z)
        {
            for(int k:val )
            {
                System.out.print(k+" ");
            }
        }
        System.out.println();

    }
}
