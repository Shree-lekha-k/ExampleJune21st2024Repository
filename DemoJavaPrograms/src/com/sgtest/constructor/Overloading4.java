package com.sgtest.constructor;
class Insurance
{
    Insurance(String Insurance_name,String Insurer_name,String Insurance_type)
    {
        System.out.println("name:"+Insurance_name);
        System.out.println("Insurer name:"+Insurer_name);
        System.out.println("Insurance type:"+Insurance_type);
    }
    Insurance(int Insurance_no)
    {
        System.out.println("insurance no:"+Insurance_no);
    }
}
public class Overloading4 {
    public static void main(String[] args)
    {
        Insurance i1=new Insurance("LIC","Bhavya","bike");
        Insurance i2=new Insurance(568884);
    }
}
