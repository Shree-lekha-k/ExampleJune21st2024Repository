package com.sgtest.programs;

import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;

public class Person {
    String firstname;
    int age;
    public static void main(String args[])
    {
        Person obj1=new Person();
        obj1.firstname="santosh";
        obj1.age=22;
        System.out.println("firstname:"+obj1.firstname);
        System.out.println("age:"+obj1.age);
        Person obj2=new Person();
        obj2.firstname="virat";
        obj2.age=44;
        System.out.println("firstname:"+obj2.firstname);
        System.out.println("age:"+obj2.age);
    }
}
