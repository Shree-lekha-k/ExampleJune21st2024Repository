package com.sgtest.Methods;
class Sum1
{
    void prime()
    {
        int sum=0;
        for(int i=200;i>=100;i--) {
            int a = 0;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    a++;
                    break;
                }
            }
            if (a == 0) {
                sum = sum + i;
            }
        }
            System.out.println(sum+" ");
    }
}
public class SumPrime {
        public static void main(String args[]){
           Sum1 s=new Sum1();
           s.prime();
}
}
