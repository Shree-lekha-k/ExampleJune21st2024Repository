package com.sgtest.returnvalue;
class Double{
    double[][] getarray()
    {
        double a[][]={{2.6,5.7,7.8},{9.8,6.5,5.5},{7.8,8.9,5.6}};
        return a;
    }
}
public class Doublearray {
    public static void main(String args[]) {
        Double d = new Double();
        double a[][] = d.getarray();
        for (double[] val : a) {
            for (double kk : val) {
                System.out.print(kk + " ");
            }
            System.out.println();
        }
    }
}
