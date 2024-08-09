package com.sgtest.constructorchaining;
class Maths4{
    Maths4(char a[][])
    {
        String s=" ";
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == 2) {
                    s = s + a[i][j] + " ";
                }
            }
        }
                    System.out.print(s + " ");
            System.out.println();
    }
}
public class Chararray {
    public static void main(String[] args){
        char b[][]={{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        Maths4 c=new Maths4(b);
    }
}
