package com.sgtest.abstraction;

abstract class University {
    void Universityname(String name) {
        System.out.println("Universityname"+name);
}
}
class College extends University
{
    void collegename(String name, int id, int noofstu)
    {
        System.out.println("college name:"+name);
        System.out.println("college id:"+id);
        System.out.println("no of student:"+noofstu);
    }
}
class Student extends College
{
    void Studentdet(String name,int id,long phno)
    {
        System.out.println("Student name:"+name);
        System.out.println("Student id:"+id);
        System.out.println("Student phno:"+phno);
    }
}
public class Demo5 {
    public static void main(String args[])
    {
        Student s=new Student();
        s.Universityname("VTU");
        s.collegename("Svce",111,256);
        s.Studentdet("Shree",98,8765545635L);
    }
}
