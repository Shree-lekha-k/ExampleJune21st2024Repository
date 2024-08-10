package com.sgtest.strings;

public class Palindrome {
    public static void main(String args[]){
        name();
    }
    static void name()
    {
        String sp=new String("mom");
        System.out.println(sp);
        String str=" ";
        for(int i=sp.length()-1;i>=0;i--)
        {
            str = str + sp.charAt(i);
        }
          if (sp.equalsIgnoreCase(str))
          {
              System.out.println("it is palindrome");
          }
          else
          {
              System.out.println("it is not palindrome");
          }
        }
}
