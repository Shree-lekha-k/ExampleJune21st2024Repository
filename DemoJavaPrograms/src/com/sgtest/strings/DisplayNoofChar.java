package com.sgtest.strings;

public class DisplayNoofChar {
    public static void main(String args[])
    {
        String s="shreelekha";
        int count=0;
        for(char kk:s.toCharArray())
        {
            count=count+1;
        }
        System.out.println(count+" ");
    }
}
