package com.sgtest.p1;

    public class Protection {
        private int private_a=100;
        protected int protected_b=200;
        int default_c=300;
        public int public_d=400;
        public Protection()
        {
            System.out.println("private a:"+private_a);
            System.out.println("protected b:"+protected_b);
            System.out.println("default c:"+default_c);
            System.out.println("public d:"+public_d);
            System.out.println("+++++++++++++++++++++++++");
        }
    }
