package com.sgtest.returnvalue;
class Multi
{
    int add(int x, int y)
    {
        int res=x+y;
        return res;
    }
    int sub(int x,int y) {
        int res = x - y;
        return res;
    }
        void multiplication(int x,int y)
        {
            int res=x*y;
            System.out.println(res);
        }
    }
public class Demo1 {
    public static void main(String args[])
    {
        Multi m=new Multi();
        m.multiplication(m.add(10,20),m.sub(23,12));
    }
}
