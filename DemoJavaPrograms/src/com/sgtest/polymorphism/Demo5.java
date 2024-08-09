package com.sgtest.polymorphism;
abstract class Clothes{
    abstract void wear();
}
class Pant extends Clothes{
    void wear(){
        System.out.println("wearing pant");
    }
}
class Tshirt extends Clothes{
    void wear(){
        System.out.println("wearing Tshirt");
    }
}
class Hoodies extends Clothes{
    void wear(){
        System.out.println("wearing Hoodies");
    }
}
public class Demo5 {
    public static void main(String args[])
    {
        Hoodies hoodies=new Hoodies();
        hoodies.wear();
        Tshirt tshirt=new Tshirt();
        tshirt.wear();
        Pant pant=new Pant();
        pant.wear();
    }
}
