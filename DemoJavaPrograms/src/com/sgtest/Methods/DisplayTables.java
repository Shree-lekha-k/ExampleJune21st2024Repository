package com.sgtest.Methods;
//display tables 1to20
class Tables
{
    void Display(){
        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=10;j++){
                String s=i+" * "+j+" ="+(i*j);
                System.out.println(s+" ");
            }
        }
    }
}
public class DisplayTables {
    public static void main(String args[])
    {
        Tables t=new Tables();
        t.Display();
    }
}
