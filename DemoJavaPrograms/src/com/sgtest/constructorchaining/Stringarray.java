package com.sgtest.constructorchaining;
class Maths2 {

    Maths2(String a[][]) {
        String str=" ";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 1) {
                    str = str + a[i][j] + " ";
                }
            }
        }
            System.out.print(str + " ");
            System.out.println();
        }
    }
public class Stringarray {
    public static void main(String args[]) {
        String x[][] = {{"cat", "dog", "monkey"}, {"cow", "goat", "Sheep"}, {"buffalo", "rabit", "rat"}};
        Maths2 o1 = new Maths2(x);
    }
}
