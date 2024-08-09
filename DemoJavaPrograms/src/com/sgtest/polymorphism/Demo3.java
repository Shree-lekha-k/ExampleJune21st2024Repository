package com.sgtest.polymorphism;
abstract class  Bags
{
    abstract void item_storage();
}
class Bagpack extends Bags{
    void item_storage()
    {
        String a="Book";
        String b="laptop";
        System.out.println("Item storage in bagpack:"+a+","+b);
    }
}
class Trolley_bags extends Bags{
    void item_storage()
    {
        String d="clothes";
        String e="shoes";
        System.out.println("Item storage in trolley bags:"+d+","+e);
    }
}
public class Demo3 {
    public static void main(String args[])
    {
        Trolley_bags tbag= new Trolley_bags();
        Bagpack bagp=new Bagpack();
        tbag.item_storage();
        bagp.item_storage();
    }
}
