package com.sgtest.constructor;
class Wholesaler1
{
    String sellername;
    String address;
    String productsupplied;
    Long phno;
    Wholesaler1(String sellername,String address,String productsupplied,Long phno)
    {
        this.sellername=sellername;
       this.address=address;
        this.productsupplied=productsupplied;
        this.phno=phno;
        System.out.println("Seller name:"+sellername);
        System.out.println("Address:"+address);
        System.out.println("products supplied:"+productsupplied);
        System.out.println("phone no:"+phno);
    }
}
class Purchaser1
{
    String purchasername;
    String itemname;
    int itemcost;
    int purchasedate;
    Purchaser1(String purchasername,String itemname,int itemcost,int purchasedate)
    {
        this.purchasername=purchasername;
        this.itemname=itemname;
        this.itemcost=itemcost;
        this.purchasedate=purchasedate;
        System.out.println("Purchaser: "+purchasername);
        System.out.println("Item name:"+itemname);
        System.out.println("Item cost:"+itemcost);
        System.out.println("purchase date:"+purchasedate);
    }
}
class Retailer1
{
    String productname;
    int productId;
    String stock;
    Retailer1(String productname,int productId,String stock )
    {
        this.productname=productname;
        this.productId=productId;
        this.stock=stock;
        System.out.println("Productname:"+productname);
        System.out.println("ProductId:"+productId);
        System.out.println("stock:"+stock);
    }
}
public class Thisoperator3 {
    public static void main(String[] args)
    {
        Wholesaler o1=new Wholesaler("Shashi","Bengaluru","Electronic device",8865989989L);
        Purchaser o2=new Purchaser("suni","Dairy Milk chocolate",45,2/3/24);
        Retailer o3=new Retailer("books",234,"Full");
    }
}

