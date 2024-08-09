package com.sgtest.constructorchaining;
class Maths9
{
    Maths9(int d[][])
    {
        String str=" ";
        for(int i=0;i<d.length;i++) {
            for (int j = 0; j < d[i].length; j++) {
                if ((j == 1) || (j == 2)) {
                    str = str + d[i][j]+" ";
                }
            }
        }
            System.out.println(str+" ");
    }
}
public class Elementsalone {
    public static void main(String[] args)
    {
        int a[][]={{2,5,7},{7,8,9},{12,6,8}};
        Maths9 m=new Maths9(a);
    }
}
