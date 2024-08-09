package com.sgtest.constructor;
class Buyer
{
    Buyer(String product_name,String Buyer_name,String Buyer_mailid)
    {
        System.out.println(product_name);
        System.out.println(Buyer_name);
        System.out.println(Buyer_mailid);
    }
    Buyer(Long mobno)
    {
        System.out.println("Mob no:" + mobno);
    }
    Buyer (int date)
    {
        System.out.println("date:"+date);
    }
}
public class Overloading3 {
    public static void main(String[] args)
    {
        Buyer b1=new Buyer("Pens","Bhanu","bhanu@gmail.com");
        Buyer b2=new Buyer(8855777778L);
        Buyer b3=new Buyer(1/3/24);
    }
}
