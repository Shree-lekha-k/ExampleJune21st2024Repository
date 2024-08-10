package com.sgtest.strings;

public class ReverseString {
    public static void main(String[] args)
    {
        reverse();
        reverse1();
    }
    static void reverse()
    {
        String a="SHREELEKHA";
        String s=" ";
        for(int i=a.length()-1;i>=0;i--){
            s=s+a.charAt(i)+" ";
        }
        System.out.println(s);
    }
    static void reverse1()
    {
        String a="Program";
        String s=" ";
        char c[]=a.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            s=s+c[i]+" ";
        }
        System.out.println(s+" ");
    }
}
