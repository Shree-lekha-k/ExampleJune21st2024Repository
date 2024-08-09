package com.sgtest.constructorchaining;
class Maths8
{
    Maths8(int p[][])
    {
        int count=0;
        for(int c[]:p)
        {
            for(int kk:c)
            {
                count=count+1;
            }
        }
        System.out.println(count+" ");
    }
}
public class NoOfElements {
    public static void main(String[] args)
    {
        int b[][]={{34,56,78},{5,67,89},{45,78,97}};
        Maths8 m=new Maths8(b);
    }
}
