package com.sgtest.returnvalue;
class SumAll
{

short elements(short a[][])
{
    short sum=0;
    for(short i=0;i<a.length;i++)
    {
        for(short j=0;j<a[i].length;j++)
        {
          sum+=a[i][j];
        }
    }
    return sum;
}
}
public class SumOfallElements {
    public static void main(String[] args) {
        SumAll m = new SumAll();
        short a[][] = {{1, 2, 3}, {4, 5, 7}, {3, 4, 6}};
        short b = m.elements(a);
        System.out.print(b);
    }
}
