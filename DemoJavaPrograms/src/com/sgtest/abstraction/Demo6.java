package com.sgtest.abstraction;
abstract class Customer
{
    String customername;
    long phno;
    Customer(String cusname,long phno)
    {
        customername=cusname;
        this.phno=phno;
        System.out.println("Customer name:"+customername);
        System.out.println("customer phno:"+phno);
    }
}
class Pro_type extends Customer{
    String proname;
    Pro_type(String Name,String customername,long phno)
    {
        super(customername,phno);
        proname=Name;
        System.out.println("product type name:"+proname);
    }
}
class Product extends Pro_type
{
    String productname;
    int productid;
    Product(String productname,int proid,String Name,String customername,long phno)
    {
        super(Name,customername,phno);
        this.productname=productname;
        productid=proid;
        System.out.println("product name:"+productname);
        System.out.println("product id:"+productid);
    }
}
public class Demo6 {
    public static void main(String[] args)
    {
        Product p=new Product("Tv",7643,"Electroni device","Kiran", 8754677876L);
    }
}
