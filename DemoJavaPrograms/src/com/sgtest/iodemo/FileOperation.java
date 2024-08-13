package com.sgtest.iodemo;

import java.io.File;

public class FileOperation {
    public static void main(String[] args)
    {
        deletefiles();
        displayfiles();
        renamefiles();
    }
    private static void deletefiles(){
        File s1=new File("D://DemoFolder//Demotext1.txt");
        boolean b1= s1.delete();
        System.out.println("Delete the text1 file:"+b1);

        File s2=new File("D://DemoFolder//Demotext2.txt");
        boolean b2= s2.delete();
        System.out.println("Delete the text2 File:"+b2);

        File s3=new File("D://DemoFolder//Demotext3.txt");
        boolean b3=s3.delete();
        System.out.println("Delete the text3 file:"+b3);

        File s4=new File("D://DemoFolder//Demotext4.txt");
        boolean b4=s4.delete();
        System.out.println("Delete the text4 file:"+b4);

        File s5=new File("D://DemoFolder//Demotext5.txt");
        boolean b5=s5.delete();
        System.out.println("Delete the text5 file:"+b5);
    }
    private static void displayfiles(){

        File s1=new File("D://DemoFolder//image1.bmp");
        String b1=s1.getName();
        System.out.println("Display the image1 file:"+b1);

        File s2=new File("D://DemoFolder//image2.bmp");
        String b2=s2.getName();
        System.out.println("Display the image2 file:"+b2);

        File s3=new File("D://DemoFolder//image3.bmp");
        String b3=s3.getName();
        System.out.println("Display the image3 file:"+b3);

        File s4=new File("D://DemoFolder//image4.bmp");
        String b4=s4.getName();
        System.out.println("Display the image4 file:"+b4);

        File s5=new File("D://DemoFolder//image5.bmp");
        String b5=s5.getName();
        System.out.println("Display the image5 file:"+b5);
    }
    private static void renamefiles(){
        File s1=new File("D://DemoFolder//image1.bmp");
        File s11=new File("D://DemoFolder//newimage1.bmp");
        boolean b1=s1.renameTo(s11);
        System.out.println("rename the image1 file:"+b1);

        File s2=new File("D://DemoFolder//image2.bmp");
        File s22=new File("D://DemoFolder//newimage2.bmp");
        boolean b2=s2.renameTo(s22);
        System.out.println("rename the image2 file:"+b2);

        File s3=new File("D://DemoFolder//image3.bmp");
        File s33=new File("D://DemoFolder//newimage3.bmp");
        boolean b3=s3.renameTo(s33);
        System.out.println("rename the image3 file:"+b3);

        File s4=new File("D://DemoFolder//image4.bmp");
        File s44=new File("D://DemoFolder//newimage4.bmp");
        boolean b4=s4.renameTo(s44);
        System.out.println("rename the image4 file:"+b4);

        File s5=new File("D://DemoFolder//image5.bmp");
        File s55=new File("D://DemoFolder//newimage5.bmp");
        boolean b5=s5.renameTo(s55);
        System.out.println("rename the image5 file:"+b5);
    }
}
