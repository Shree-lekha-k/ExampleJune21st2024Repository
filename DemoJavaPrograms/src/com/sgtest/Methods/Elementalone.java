package com.sgtest.Methods;
class Elements
{
    void array1(int a[][])
    {
        for (int i=0;i<a.length;i++ ){
            for(int j=0;j<a.length;j++){
                if((i==2)||(i==3))
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
public class Elementalone {
    public static void main(String args[])
    {
        Elements e=new Elements();
        int a[][]={{1,2,3,4},{6,7,8,9},{3,4,5,6},{5,6,7,8}};
        e.array1(a);
    }
}
