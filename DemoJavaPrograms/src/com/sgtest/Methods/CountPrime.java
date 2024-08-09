package com.sgtest.Methods;
class Count
{
    void prime()
    {
        int num=100;
        int count=0;
        for(int i=0;i<=100;i++)
        {
            int a=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    a++;
                    break;
                }
            }
            if(a==0){
                count=count+1;
            }

            }
        System.out.println(count+" ");
    }
}
public class CountPrime {
    public static void main(String args[]){
        Count c=new Count();
        c.prime();
    }
}
