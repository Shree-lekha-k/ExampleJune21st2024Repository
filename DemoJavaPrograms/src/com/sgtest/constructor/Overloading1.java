package com.sgtest.constructor;
class Product
{
    Product(String product_type,String product_name)
    {
        System.out.println("product_type:"+product_type + ", " +"product_name:"+ product_name);
    }
    Product(int  product_Id,int product_price)
    {
        System.out.println("productid:"+product_Id+" ,"+"product_price:"+product_price);
    }
}
public class Overloading1 {
    public static void main(String[] args)
    {
        Product o1=new Product("Electronic gadgets","earphone");
        Product o2=new Product(5678,300);
    }
}
