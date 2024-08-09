package com.sgtest.returnvalue;
class Colm {
    int[] element(int a[][] )
    {
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++) {
                b[i] = a[i][0];
            }
        }
        return b;
    }
}
public class Colm1st {
    public static void main(String args[])
    {
        Colm c=new Colm();
        int a[][]={{4,5,6},{7,6,5},{4,5,9}};
        int z[][]= new int[][]{c.element(a)};
        for(int[] val:z) {
            for (int k : val) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
