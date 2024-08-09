package com.sgtest.constructor;
class University
{
    String universityName;
    String location;
    long contactno;
    String emailid;
    University(String Name,String Location,long Contactno,String Email)
    {
        universityName=Name;
        location=Location;
        contactno=Contactno;
        emailid=Email;
        System.out.println("University Name:"+universityName);
        System.out.println("location:"+location);
        System.out.println("contact no:"+contactno);
        System.out.println("Emailid:"+emailid);
    }
}
class College
{
    String collegeName;
    String departmentName;
    int collegeId;
    String university;
    College(String Name,String Deptname,int id,String UniName)
    {
        collegeName=Name;
        departmentName=Deptname;
        collegeId=id;
        university=UniName;
        System.out.println("College name:"+collegeName);
        System.out.println("Department name:"+departmentName);
        System.out.println("College id:"+collegeId);
        System.out.println("university:"+university);
    }
}
class student
{
    String studentname;
    int studentId;
    String deptName;
    Long studentPhno;
    student(String name,int stuId,String Deptname,Long phno)
    {
        studentname=name;
        studentId=stuId;
        deptName=Deptname;
        studentPhno=phno;
        System.out.println("Student name:"+studentname);
        System.out.println("Student Id:"+studentId);
        System.out.println("Dept name:"+deptName);
        System.out.println("Student phno:"+studentPhno);
    }
}
public class ParameterizedConstructor1 {
    public static void main(String[] args)
    {
        University o1=new University("visveswaraiah technology university","yelahanka",7923786489L,"Vtu.ac.in");
        College o2=new College("Sree Venkateshwara College","ECE",1002,"VTU");
        student o3=new student("Shree",897,"Ece",7899335556L);
    }
}
