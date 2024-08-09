package com.sgtest.programs;
class Customer1 {
    String Customer_name;
    int Customer_id;
    String customer_email;
    int phoneno;
    Customer1()
    {
        Customer_name = "Varsha";
        Customer_id = 4567;
        customer_email="ahjsgwih@gmail.com";
        phoneno=824723729;
        System.out.println("Customer_name: " + Customer_name);
        System.out.println("Customer_id: " + Customer_id);
        System.out.println("customer_email:"+customer_email);
        System.out.println("phoneno:"+phoneno);
        System.out.println("+++++++++++++++++");
    }
}
class Project2{
    String Project_name;
    int Project_id;
    String project_head;
    String project_technology;
    Project2()
    {
        Project_name = "Iot based weather monitoring";
        Project_id = 566;
        project_head="Jijjesh";
        project_technology="IoT";
        System.out.println("Project_name:" + Project_name);
        System.out.println("Project_id:" + Project_id);
        System.out.println("Project_head:"+project_head);
        System.out.println("project_technology:"+project_technology);
        System.out.println("+++++++++++++++");
    }
}
class Task1{
    String task_name;
    int task_id;
    String task_time;
    int task_team;
    Task1()
    {
        task_name = "Software New feature";
        task_id = 788576;
        task_time="5hours";
        task_team=5;
        System.out.println("task_name:" + task_name);
        System.out.println("task_id:" + task_id);
        System.out.println("task_time:"+task_time);
        System.out.println("task_team:"+task_team);
    }
}
public class ArgsDemo4 {
    public static void main(String[] args){
        Customer1 obj1=new Customer1();
        Project2 obj2=new Project2();
        Task1 obj3=new Task1();
    }
}
