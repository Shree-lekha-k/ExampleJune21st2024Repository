package com.sgtest.programs;

class Fruits {
    String Fruit_name;
    String Fruit_color;
    String Scientific;
    String family;
}
class Flowers{
    String Flower_name;
    String Flower_color;
    String Scientific;
    String family;
}
class Vegetables{
    String Veg_name;
    String Veg_color;
    String Scientific;
    String family;
}
public class Demo2{
    public static void main(String args[]) {
        Fruits obj1 = new Fruits();
        obj1.Fruit_name = "Apple";
        obj1.Fruit_color = "Red";
        obj1.Scientific="Malus pumila";
        obj1.family="Rosaceae";
        System.out.println("Fruit_name: " + obj1.Fruit_name);
        System.out.println("Fruit_color: " + obj1.Fruit_color);
        System.out.println("Fruit_scientific:"+obj1.Scientific);
        System.out.println("Fruit_family:"+obj1.family);
        System.out.println("+++++++++++++++++");
        Flowers obj2 = new Flowers();
        obj2.Flower_name = "Sunflower";
        obj2.Flower_color = "Yellow";
        obj2.Scientific="helianthus annuus";
        obj2.family="Daisy";
        System.out.println("Flower_name:" + obj2.Flower_name);
        System.out.println("Flower_color:" + obj2.Flower_color);
        System.out.println("Flower scientific:"+obj2.Scientific);
        System.out.println("Flower_family:"+obj2.family);
        System.out.println("+++++++++++++++");
        Vegetables obj3 = new Vegetables();
        obj3.Veg_name = "Radish";
        obj3.Veg_color = "White";
        obj3.Scientific="Raphanus sativus";
        obj3.family="Brassicaceae";
        System.out.println("Veg_name:" + obj3.Veg_name);
        System.out.println("Veg_color:" + obj3.Veg_color);
        System.out.println("scientific:"+obj3.Scientific);
        System.out.println("veg_family:"+obj3.family);
    }
}

