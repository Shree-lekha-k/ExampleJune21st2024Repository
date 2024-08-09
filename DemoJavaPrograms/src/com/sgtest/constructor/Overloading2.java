package com.sgtest.constructor;
class Whole_saler
{
    Whole_saler(String Seller_name,String Address,String Product)
    {
        System.out.println("seller name:"+Seller_name);
        System.out.println("Address:"+Address);
        System.out.println("Product:"+ Product);
    }
    Whole_saler(int Product_id )
    {
        System.out.println("product id:"+Product_id);
    }
}
public class Overloading2 {
    public static void main(String args[])
    {
        Whole_saler o1=new Whole_saler("Harshi","kodigehalli","books");
        Whole_saler o2=new Whole_saler(456);
    }
}
