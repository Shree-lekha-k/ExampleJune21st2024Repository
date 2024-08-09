package com.sgtest.returnvalue;

class Concatenation
{
    String[][] array()
{
    String a[][] = {{"Mango", "banana", "Apple"}, {"orange", "pomogranate", "grapes"}};
    String str=" ";
    for(int i=0;i<a.length;i++) {
        for (int j = 0; j <a[i].length; j++) {
            str = str + a[i][j] + " ";
        }
    }
    return a;
}
}
public class ConcatenationString {
    public static void main(String[] args) {
        Concatenation m = new Concatenation();
        String b[][] = m.array();
        for (String[] val : b) {
            for (String k : val) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
