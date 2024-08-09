package com.sgtest.inheritance;
class Deptname
{
    void Dept(String name,int noofstu)
    {
        System.out.println("deptname:"+name+" ");
        System.out.println("No of stu:"+noofstu+" ");
    }
}
class Hod extends Deptname
{
    void lecture(String hodname,int nooflecturers)
    {
        System.out.println("hod name:"+hodname);
        System.out.println("lecturers:"+nooflecturers);
    }
}
class Student1 extends Deptname
{
    void Stu(String name,int id)
    {
        System.out.println("stu name:"+name);
        System.out.println("stu id:"+id);
    }
}
public class Hierarchial {
    public static void main(String args[])
    {
         Hod d=new Hod();
         d.lecture("Jijjesh",14);
        d.Dept("ECE",120);
        Student1 s=new Student1();
        s.Stu("Varshu",98);
        d.Dept("Ece",120);
    }
}
