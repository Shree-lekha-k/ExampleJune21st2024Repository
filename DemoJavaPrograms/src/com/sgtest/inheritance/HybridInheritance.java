package com.sgtest.inheritance;
class Customer{
    void cus(String name)
    {
        System.out.println("Customer name:"+name);
    }
}
class Protype1 extends Customer{
    void type1(String name)
    {
        System.out.println("Pro1_name:"+name);
    }
}
class Protype2 extends Customer{
    void type2(String name) {
        System.out.println("pro2 name:" + name );
    }
}
class Product extends Protype2
{
    void pro(String name,int cost)
    {
        System.out.println("product:"+name);
    }
}

public class HybridInheritance {
    public static void main(String[] args)
    {
        Protype1 o=new Protype1();
        o.type1("Appliances");
        o.cus("Ravi");
        Product o1=new Product();
        o1.pro("Tv",20000);
        o1.type2("Electronic device");
    }
}
