package com.sgtest.iodemo;

import java.io.File;

public class SubFoldersOfWeekday {
    public static void main(String[] args){
        CreateFoldersWeekdays();
    }

    private static void CreateFoldersWeekdays() {
        File f1=new File("D:\\Weekdays\\Monday");
        boolean v1=f1.mkdirs();
        System.out.println("is folder1 Monday created:"+v1);

        File f2=new File("D:\\Weekdays\\Tuesday");
        boolean v2=f2.mkdirs();
        System.out.println("is folder2 Tuesday created:"+v2);

        File f3=new File("D:\\Weekdays\\Wednesday");
        boolean v3=f3.mkdirs();
        System.out.println("is folder3 Wednesday created:"+v3);

        File f4=new File("D:\\Weekdays\\Thursday");
        boolean v4=f4.mkdirs();
        System.out.println("is folder4 Thursday created:"+v4);

        File f5=new File("D:\\Weekdays\\Friday");
        boolean v5=f5.mkdirs();
        System.out.println("is folder5 Friday created:"+v5);

        File f6=new File("D:\\Weekdays\\Saturday");
        boolean v6=f6.mkdirs();
        System.out.println("is folder6 Saturday created:"+v6);

        File f7=new File("D:\\Weekdays\\Sunday");
        boolean v7=f7.mkdirs();
        System.out.println("is folder7 Sunday created:"+v7);

    }
}
