package com.sgtest.constructor;
class Shop
{
    String shopname;
    String shopAddress;
    String ownername;
    Long phno;
    Shop(String Name,String Address,String name,Long contno)
    {
        shopname=Name;
        shopAddress=Address;
        ownername=name;
        phno=contno;
        System.out.println("Shop name:"+shopname);
        System.out.println("Shop Address:"+shopAddress);
        System.out.println("Owner name:"+ownername);
        System.out.println("phone no:"+phno);
    }
}
class Purchase
{
    String itemname;
    int itemcost;
    int purchasedate;
    Purchase(String Name,int cost,int date)
    {
        itemname=Name;
        itemcost=cost;
        purchasedate=date;
        System.out.println("Item name:"+itemname);
        System.out.println("Item cost:"+itemcost);
        System.out.println("purchase date:"+purchasedate);
    }
}
class Distributor
{
    String distributerName;
    String distributerAddress;
    String emailId;
    Long phno;
    Distributor(String Name,String Address,String email,Long Contno)
    {
        distributerName=Name;
        distributerAddress=Address;
        emailId=email;
        phno=Contno;
        System.out.println("Distributer name:"+distributerName);
        System.out.println("Distributer Address:"+distributerAddress);
        System.out.println("Mail Id:"+emailId);
        System.out.println("phone no:"+phno);
    }
}
public class ParameterizedConstructor2 {
    public static void main(String[] args) {
        Shop o1 = new Shop("Eleven", "Bengaluru", "Chetan", 7864995754L);
        Purchase o2 = new Purchase("Dairy Milk chocolate", 45, 2 / 3 / 24);
        Distributor o3 = new Distributor("Suni", "bengaluru", "suni@gmail.com", 9842635666L);
    }
}
