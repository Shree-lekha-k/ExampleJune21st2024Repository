package com.sgtest.constructor;
class University1
{
    String universityName;
    String location;
    long contactno;
    String emailid;
    University1(String universityName,String location,long contactno,String emailid)
    {
        this.universityName=universityName;
        this.location=location;
        this.contactno=contactno;
        this.emailid=emailid;
        System.out.println("University Name:"+universityName);
        System.out.println("location:"+location);
        System.out.println("contact no:"+contactno);
        System.out.println("Emailid:"+emailid);
    }
}
class College1
{
    String collegeName;
    String departmentName;
    int collegeId;
    String university;
    College1(String collegeName,String departmentName,int collegeId,String university)
    {
        this.collegeName=collegeName;
        this.departmentName=departmentName;
        this.collegeId=collegeId;
        this.university=university;
        System.out.println("College name:"+collegeName);
        System.out.println("Department name:"+departmentName);
        System.out.println("College id:"+collegeId);
        System.out.println("university:"+university);
    }
}
class Student1
{
    String studentname;
    int studentId;
    String deptName;
    Long studentPhno;
    Student1(String studentname,int studentId,String deptName,Long studentPhno)
    {
        this.studentname=studentname;
        this.studentId=studentId;
        this.deptName=deptName;
        this.studentPhno=studentPhno;
        System.out.println("Student name:"+studentname);
        System.out.println("Student Id:"+studentId);
        System.out.println("Dept name:"+deptName);
        System.out.println("Student phno:"+studentPhno);
    }
}
public class Thisoperator1{
    public static void main(String[] args)
    {
        University o1=new University("Visveswaraya Technology University","yelahanka",789829445,"vtu.ac.in");
        College o2=new College("BMSIT","CSE",789,"VTU");
        student o3=new student("priya",6556,"ISE",7899335556L);
    }
}

