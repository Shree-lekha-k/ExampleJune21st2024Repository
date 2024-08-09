package com.sgtest.constructorchaining;
class Maths7
{
    Maths7(int s[])
    {
        for(int i=0;i<s.length;i++){
            s[i]=s[i]/2;
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
public class Displayvalue {
    public static void main(String args[])
    {
        int a[]={10,24,46,56,78,98,56};
        Maths7 o1=new Maths7(a);
    }
}
