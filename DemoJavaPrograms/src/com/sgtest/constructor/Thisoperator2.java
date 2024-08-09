package com.sgtest.constructor;
class Shop1
{
    String shopname;
    String shopAddress;
    String ownername;
    Long phno;
    Shop1(String shopname,String shopAddress,String ownername,Long phno)
    {
        this.shopname=shopname;
        this.shopAddress=shopAddress;
        this.ownername=ownername;
        this.phno=phno;
        System.out.println("Shop name:"+shopname);
        System.out.println("Shop Address:"+shopAddress);
        System.out.println("Owner name:"+ownername);
        System.out.println("phone no:"+phno);
    }
}
class Purchase1
{
    String itemname;
    int itemcost;
    int purchasedate;
    Purchase1(String itemname,int itemcost,int purchasedate)
    {
        itemname=itemname;
        itemcost=itemcost;
        purchasedate=purchasedate;
        System.out.println("Item name:"+itemname);
        System.out.println("Item cost:"+itemcost);
        System.out.println("purchase date:"+purchasedate);
    }
}
class Distributor1
{
    String distributerName;
    String distributerAddress;
    String emailId;
    Long phno;
    Distributor1(String distributerName,String distributerAddress,String emailId,Long phno)
    {
        this.distributerName=distributerName;
        this.distributerAddress=distributerAddress;
        this.emailId=emailId;
        this.phno=phno;
        System.out.println("Distributer name:"+distributerName);
        System.out.println("Distributer Address:"+distributerAddress);
        System.out.println("Mail Id:"+emailId);
        System.out.println("phone no:"+phno);
    }
}
public class Thisoperator2 {
    public static void main(String[] args) {
        Shop o1 = new Shop("Eleven", "Bengaluru", "Chetan", 7864995754L);
        Purchase o2 = new Purchase("Dairy Milk chocolate", 45, 2 / 3 / 24);
        Distributor o3 = new Distributor("Suni", "bengaluru", "suni@gmail.com", 9842635666L);
    }
}

