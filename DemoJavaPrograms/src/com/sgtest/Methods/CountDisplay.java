package com.sgtest.Methods;
class Count1{
    void display()
    {
        int count=0;
        for(int i=200;i<=400;i++){
            if((i%2==0)&&(i%4==0)&&(i%6==0))
            {
                count=count+1;
            }
        }
        System.out.println(count+" ");
    }
}
public class CountDisplay {
    public static void main(String args[])
    {
        Count1 c=new Count1();
        c.display();
    }
}
