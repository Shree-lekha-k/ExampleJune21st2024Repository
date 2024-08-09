package com.sgtest.returnvalue;
class Return1
{
    int array1()
    {
        int s[]={1,2,3,4,6,7};
            return s[0];

    }
}
public class Array1 {
    public static void main(String args[])
    {
        Return1 r=new Return1();
        int z=r.array1();
        {
            for(int i=0;i<z;i++)
            {
                System.out.println(z+" ");
            }
        }
    }
}
