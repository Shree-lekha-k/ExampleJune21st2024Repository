package com.sgtest.Methods;
class CharInt
{
    void display(char a[][])
    {
        int c[][]=new int[a.length][a.length];
        for(char i=0;i<a.length;i++)
        {
            for(char j=0;j<a.length;j++)
            {
                c[i][j]=a[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class CharToInt {
    public static void main(String args[])
    {
        CharInt c=new CharInt();
        char a[][]={{'a','b','c'},{'d','e','f'},{'s','t','u'}};
        c.display(a);
    }
}
