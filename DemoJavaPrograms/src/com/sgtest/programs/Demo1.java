package com.sgtest.programs;

class Employee {
        String Employ_name;
        int Employ_Mob;
        int Employ_Id;
        int Employ_Salary;
    }
    class Department{
        String Dept_name;
        String hod;
        int Students;
        int staffs;
    }
    class Insurance{
        String Insurance_name;
        String Insurer_name;
        String Insurance_type;
        int Insurance_no;
    }
    public class Demo1{
        public static void main(String args[]) {
            Employee obj1 = new Employee();
            obj1.Employ_name = "Shree";
            obj1.Employ_Mob= 7207360;
            obj1.Employ_Id=56797;
            obj1.Employ_Salary=30000;
            System.out.println("Employ_name: " + obj1.Employ_name);
            System.out.println("Employ_Mob: " + obj1.Employ_Mob);
            System.out.println("Employ_Id:"+obj1.Employ_Id);
            System.out.println("Employ_Salary:"+obj1.Employ_Salary);
            System.out.println("+++++++++++++++++");
            Department obj2 = new Department();
            obj2.Dept_name = "Electronics and communication";
            obj2.hod = "Jijjesh";
            obj2.Students=25;
            obj2.staffs=12;
            System.out.println("Dept_name:" + obj2.Dept_name);
            System.out.println("hod:" + obj2.hod);
            System.out.println("Students:"+obj2.Students);
            System.out.println("Staffs:"+obj2.staffs);
            System.out.println("+++++++++++++++");
            Insurance obj3 = new Insurance();
            obj3.Insurance_name = "LIC" ;
            obj3.Insurer_name = "Thanu";
            obj3.Insurance_type="Car";
            obj3.Insurance_no=5687547;
            System.out.println("Insurance_name:" + obj3.Insurance_name);
            System.out.println("Insurer_name:" + obj3.Insurer_name);
            System.out.println("Insurance_type:"+obj3.Insurance_type);
            System.out.println("Insurance_no:"+obj3.Insurance_no);
        }
    }


