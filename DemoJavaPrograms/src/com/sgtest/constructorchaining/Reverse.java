package com.sgtest.constructorchaining;
class Maths5
{
    Maths5(double d[][])
    {
        for(int i=d.length-1;i>=0;i--) {
            for (int j =d[i].length-1; j>=0;j--) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Reverse {
    public static void main(String[] args)
    {
        double c[][]={{23.4,12.76,43.15},{56.3,76.8,98.5},{32.1,65.4,67.5}};
        Maths5 m=new Maths5(c);
    }
}
