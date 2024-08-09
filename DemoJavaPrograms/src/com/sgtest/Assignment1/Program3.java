package com.sgtest.Assignment1;
class Animal{
    String Animal_name;
    String Scientific_name;
    String lifespan;
    Animal()
    {
        Animal_name="lion";
        Scientific_name="pantherus Leo";
        lifespan="16years";
        System.out.println("Animal name:"+Animal_name);
        System.out.println("Scientific_name:"+Scientific_name);
        System.out.println("lifespan:"+lifespan);
    }
}
class AcquaticAnimal{
    String name;
    String Scientificname;
    String lifespan;
    AcquaticAnimal()
    {
       name="Fish";
       Scientificname="Vertebrata";
       lifespan="5years";
        System.out.println("name:"+name);
        System.out.println("Scientificname:"+Scientificname);
        System.out.println("lifespan:"+lifespan);
    }
}
public class Program3 {
    public static void main(String[] args)
    {
        Animal obj1=new Animal();
        AcquaticAnimal obj2=new AcquaticAnimal();
    }
}
