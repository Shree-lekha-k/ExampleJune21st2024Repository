package com.sgtest.programs;
class Fruits1 {
    String Fruit_name;
    String Fruit_color;
    String Scientific;
    String family;
    Fruits1()
    {
        Fruit_name = "Apple";
        Fruit_color = "Red";
        Scientific="Malus pumila";
        family="Rosaceae";
        System.out.println("Fruit_name: " + Fruit_name);
        System.out.println("Fruit_color: " + Fruit_color);
        System.out.println("Fruit_scientific:"+Scientific);
        System.out.println("Fruit_family:"+family);
        System.out.println("+++++++++++++++++");
    }
}
class Flowers1{
    String Flower_name;
    String Flower_color;
    String Scientific;
    String family;
    Flowers1()
    {
        Flower_name = "Sunflower";
        Flower_color = "Yellow";
        Scientific="helianthus annuus";
        family="Daisy";
        System.out.println("Flower_name:" + Flower_name);
        System.out.println("Flower_color:" + Flower_color);
        System.out.println("Flower scientific:"+Scientific);
        System.out.println("Flower_family:"+family);
        System.out.println("+++++++++++++++");
    }
}
class Vegetables1{
    String Veg_name;
    String Veg_color;
    String Scientific;
    String family;
    Vegetables1()
    {
        Veg_name = "Radish";
        Veg_color = "White";
        Scientific="Raphanus sativus";
        family="Brassicaceae";
        System.out.println("Veg_name:" + Veg_name);
        System.out.println("Veg_color:" + Veg_color);
        System.out.println("scientific:"+Scientific);
        System.out.println("veg_family:"+family);
    }
}
public class ArgsDemo2 {
    public static void main(String[] args)
    {
        Fruits1 obj1=new Fruits1();
        Flowers1 obj2=new Flowers1();
        Vegetables1 obj3=new Vegetables1();
    }
}
