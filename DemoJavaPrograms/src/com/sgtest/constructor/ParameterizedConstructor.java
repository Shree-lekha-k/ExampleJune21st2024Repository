package com.sgtest.constructor;

class Person
{
    String firstName;
    int age;
    Person(String firstName,int age)
    {
        firstName=firstName;
        age=age;
        System.out.println("First Name:"+firstName);
        System.out.println("Age:"+age);
    }
}
public class ParameterizedConstructor {
    public static void main(String args[])
    {
        Person o1=new Person("Shree",22);
        Person o2=new Person("Suni",22);
    }
}
