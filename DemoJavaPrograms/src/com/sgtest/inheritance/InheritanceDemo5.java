package com.sgtest.inheritance;
class Customer2{
    String cus_Name;
    Customer2(String name)
    {
        cus_Name=name;
        System.out.println("cus_name:"+name+" ");
    }
}
class Pro_type1 extends Customer2
{
    String protype1;
     Pro_type1(String cus_Name,String name)
     {
         super(cus_Name);
         protype1 =name;
         System.out.println("protype1:"+protype1);
    }
}
class Pro_type2 extends Customer2 {
    String protype2name;

    Pro_type2(String cus_Name, String name) {
        super(cus_Name);
        protype2name = name;
        System.out.println("protype2:" + protype2name);
    }
}
class Product1 extends Pro_type2
{
    String proname;
    int cost;
    Product1(String cus_Name,String protype2name,String name, int cost)
    {
        super(cus_Name,protype2name);
        proname=name;
        this.cost=cost;
        System.out.println("proname:"+proname);
        System.out.println("cost:"+cost);
    }
}

public class InheritanceDemo5 {
    public static void main(String[] args)
    {
        Pro_type1 p=new Pro_type1("Ravi","Appliances");
        Product1 o=new Product1("Ravi","Electronic devices","Tv",25000);
    }
}
