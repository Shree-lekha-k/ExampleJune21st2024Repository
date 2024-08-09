package com.sgtest.constructorchaining;
class Maths3 {
    Maths3(byte a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
        }
        System.out.println(sum + " ");
    }
}
public class Bytearray {
        public static void main(String[] args)
        {
            byte b[][]={{2,3,4},{3,4,5},{7,8,9}};
            Maths3 o1=new Maths3(b);
        }
}

