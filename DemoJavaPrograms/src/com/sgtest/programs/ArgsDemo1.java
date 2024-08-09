package com.sgtest.programs;
class Employee1 {
    String Employ_name;
    int Employ_Mob;
    int Employ_Id;
    int Employ_Salary;
    Employee1()
    {
        Employ_name = "Shree";
        Employ_Mob= 7207360;
        Employ_Id=56797;
        Employ_Salary=30000;
        System.out.println("Employ_name: " + Employ_name);
        System.out.println("Employ_Mob: " + Employ_Mob);
        System.out.println("Employ_Id:"+Employ_Id);
        System.out.println("Employ_Salary:"+Employ_Salary);
        System.out.println("+++++++++++++++++");
    }
}
class Department1{
    String Dept_name;
    String hod;
    int Students;
    int staffs;
    Department1()
    {
        Dept_name = "Electronics and communication";
        hod = "Jijjesh";
        Students=25;
        staffs=12;
        System.out.println("Dept_name:" + Dept_name);
        System.out.println("hod:" + hod);
        System.out.println("Students:"+Students);
        System.out.println("Staffs:"+staffs);
        System.out.println("+++++++++++++++");
    }
}
class Insurance1{
    String Insurance_name;
    String Insurer_name;
    String Insurance_type;
    int Insurance_no;
    Insurance1()
    {
        Insurance_name = "LIC" ;
        Insurer_name = "Thanu";
        Insurance_type="Car";
        Insurance_no=5687547;
        System.out.println("Insurance_name:" + Insurance_name);
        System.out.println("Insurer_name:" + Insurer_name);
        System.out.println("Insurance_type:"+Insurance_type);
        System.out.println("Insurance_no:"+Insurance_no);
    }
}

public class ArgsDemo1 {
    public static void main(String[] args){
        Employee1 obj1=new Employee1();
        Department1 obj2=new Department1();
        Insurance1 obj3=new Insurance1();
    }
}
