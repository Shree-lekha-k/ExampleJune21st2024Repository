package com.sgtest.returnvalue;
class Half
{
double[] elements(double a[])
{
    double res[]=new double[a.length/2];
    int k=0;
    for(int i=a.length/2;i<a.length;i++)
    {
            res[k]=a[i];
        k++;
    }
    return res;
}
}
public class HalfOfElement {
    public static void main(String[] args)
    {
        Half m=new Half();
        double a[]={1.8,26.4,6,9,8.45,96.7,5.6,4.76,5.67};
        double z[]=m.elements(a);
        for(double val:z)
        {
                System.out.print(val+" ");
        }
        System.out.println();

    }
}
