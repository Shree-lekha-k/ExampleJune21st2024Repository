package com.sgtest.maindemo;

import com.sgtest.p1.IndependentClassp1;
import com.sgtest.p1.Protection;
import com.sgtest.p1.SubClassInP1;
import com.sgtest.p2.IndependentClassp2;
import com.sgtest.p2.SubclassInp2;

public class MainExecutionDemo {
    public static void main(String[] args) {
        Protection p1=new Protection();
        SubClassInP1 o1=new SubClassInP1();
        IndependentClassp1 i1=new IndependentClassp1();
        SubclassInp2 p2=new SubclassInp2();
        IndependentClassp2 i2=new IndependentClassp2();
    }
}
