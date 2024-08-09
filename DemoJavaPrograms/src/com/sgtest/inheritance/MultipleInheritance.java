package com.sgtest.inheritance;
class University {
    void Univer(String name) {
        System.out.println("University:" + name);
    }
}
    class College extends  University {
        void clg(String name, int clg_id) {
            System.out.println("college:" + name + " id:" + clg_id);
        }
    }
        class Student extends College{
            void stu(String Name,String Deptname)
            {
                System.out.println("stu name:"+Name +" deptname:"+Deptname);
            }
}
public class MultipleInheritance {
    public static void main(String[] args)
    {
        Student details=new Student();
        details.stu("Shree","Ece");
        details.clg("SVCE",111);
        details.Univer("VTU");
    }
}
