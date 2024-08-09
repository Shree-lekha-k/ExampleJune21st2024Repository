package com.sgtest.p2;

import com.sgtest.p1.Protection;
import com.sgtest.p1.SubClassInP1;

public class SubclassInp2 extends Protection {
    public SubclassInp2()
    {
        //System.out.println("private a:"+private_a);
        System.out.println("protected b:"+protected_b);
        //System.out.println("default c:"+default_c);
        System.out.println("public d:"+public_d);
        System.out.println("+++++++++++++++++++++++++");
    }
}
