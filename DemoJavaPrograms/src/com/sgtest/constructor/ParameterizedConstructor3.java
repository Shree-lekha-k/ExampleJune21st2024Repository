package com.sgtest.constructor;
class Wholesaler
{
    String Sellername;
    String address;
    String productsupplied;
    Long phno;
    Wholesaler(String Name,String location,String Product,Long Contno)
    {
        Sellername=Name;
        address=location;
        productsupplied=Product;
        phno=Contno;
        System.out.println("Seller name:"+Sellername);
        System.out.println("Address:"+address);
        System.out.println("products supplied:"+productsupplied);
        System.out.println("phone no:"+phno);
    }
}
class Purchaser
{
    String purchasername;
    String itemname;
    int itemcost;
    int purchasedate;
    Purchaser(String purchaser,String Name,int cost,int date)
    {
        purchasername=purchaser;
        itemname=Name;
        itemcost=cost;
        purchasedate=date;
        System.out.println("Purchaser: "+purchasername);
        System.out.println("Item name:"+itemname);
        System.out.println("Item cost:"+itemcost);
        System.out.println("purchase date:"+purchasedate);
    }
}
class Retailer
{
    String productname;
    int productId;
    String stock;
    Retailer(String Name,int id,String name )
    {
        productname=Name;
        productId=id;
        stock=name;
        System.out.println("Productname:"+productname);
        System.out.println("ProductId:"+productId);
        System.out.println("stock:"+stock);
    }
}
public class ParameterizedConstructor3 {
    public static void main(String[] args)
    {
        Wholesaler o1=new Wholesaler("Shashi","Bengaluru","Electronic",8865989989L);
        Purchaser o2=new Purchaser("suni","Dairy Milk chocolate",45,2/3/24);
        Retailer o3=new Retailer("books",234,"Full");
    }
}
