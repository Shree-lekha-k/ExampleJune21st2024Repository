package com.sgtest.inheritance;

class Vehicle1{
    String veh1_type;
    String veh1_name;
    int veh1_num;
    Vehicle1(String type,String name,int no)
    {
        veh1_type=type;
        veh1_name=name;
        veh1_num=no;
        System.out.println("vehicle type:"+veh1_type);
        System.out.println("vehicle name:"+veh1_name);
        System.out.println("vehicle num:"+veh1_num);
    }
}
class Vehicle2 extends Vehicle1 {
    String veh2_type;
    String Veh2_name;
    int veh2_num;
    Vehicle2(String veh1_type, String veh1_name, int veh1_num,String veh2_type,String veh2_name,int veh2_num) {
        super(veh1_type, veh1_name, veh1_num);
        this.veh2_type=veh2_type;
        this.Veh2_name=veh2_name;
        this.veh2_num=veh2_num;
        System.out.println("veh2_type:"+veh2_type);
        System.out.println("veh2_name:"+veh2_name);
        System.out.println("veh2_num:"+veh2_num);
    }
}
   class Vehicle3 extends Vehicle2
   {
       String veh3_type;
       String veh3_name;
       int veh3_num;
       Vehicle3(String veh1_type, String veh1_name, int veh1_no,String veh2_type,String veh2_name,int veh2_num,String veh3_type,String veh3_name,int veh3_num)
       {
           super(veh1_type,veh1_name,veh1_no,veh2_type,veh2_name,veh2_num);
           this.veh3_type=veh3_type;
           this.veh3_name=veh3_name;
           this.veh3_num=veh3_num;
           System.out.println("veh3_type:"+veh3_type);
           System.out.println("veh3_name:"+veh3_name);
           System.out.println("veh3_num:"+veh3_num);
   }

}
public class InheritanceDemo4 {
    public static void main(String[] args)
    {
        Vehicle3 v=new Vehicle3("heavyvehicle","Truck",887346,"4wheeler","car",546,"2wheeler","bike",235);
    }
}
