package com.sgtest.Methods;
class Doarray{
    void Doarray(double a[][])
    {
        for(int i=a.length-1;i>=0;i--) {
            for (int j =a.length-1; j>=0; j--) {
                if(i==0) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
public class Doublearray {
    public static void main(String args[])
    {
        Doarray p=new Doarray();
        double a[][]={{2.1,3.4,4.5},{5.1,6.2,7.3},{7.6,8.1,9.2}};
        p.Doarray(a);
    }
}
