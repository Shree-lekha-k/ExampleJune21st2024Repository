package com.sgtest.programs;
class Customer {
    String Customer_name;
    int Customer_id;
    String customer_email;
    int phoneno;
}
class Project{
    String Project_name;
    int Project_id;
    String project_head;
    String project_technology;
}
class Task{
    String task_name;
    int task_id;
    String task_time;
    int task_team;
}
public class Demo4{
    public static void main(String args[]) {
        Customer obj1 = new Customer();
        obj1.Customer_name = "Varsha";
        obj1.Customer_id = 4567;
        obj1.customer_email="ahjsgwih@gmail.com";
        obj1.phoneno=824723729;
        System.out.println("Customer_name: " + obj1.Customer_name);
        System.out.println("Customer_id: " + obj1.Customer_id);
        System.out.println("customer_email:"+obj1.customer_email);
        System.out.println("phoneno:"+obj1.phoneno);
        System.out.println("+++++++++++++++++");
        Project obj2 = new Project();
        obj2.Project_name = "Iot based weather monitoring";
        obj2.Project_id = 566;
        obj2.project_head="Jijjesh";
        obj2.project_technology="IoT";
        System.out.println("Project_name:" + obj2.Project_name);
        System.out.println("Project_id:" + obj2.Project_id);
        System.out.println("Project_head:"+obj2.project_head);
        System.out.println("project_technology:"+obj2.project_technology);
        System.out.println("+++++++++++++++");
        Task obj3 = new Task();
        obj3.task_name = "Software New feature";
        obj3.task_id = 788576;
        obj3.task_time="5hours";
        obj3.task_team=5;
        System.out.println("task_name:" + obj3.task_name);
        System.out.println("task_id:" + obj3.task_id);
        System.out.println("task_time:"+obj3.task_time);
        System.out.println("task_team:"+obj3.task_team);
    }
}

