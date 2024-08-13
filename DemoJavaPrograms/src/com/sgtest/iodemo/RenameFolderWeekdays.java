package com.sgtest.iodemo;

import java.io.File;

public class RenameFolderWeekdays {
    public static void main(String args[]){
        CreateFolderWeekday();
        RenameWeekdays();
}
private static void CreateFolderWeekday() {
    File f1=new File("D:\\Weekdays1\\Mon");
    boolean v1=f1.mkdirs();
    System.out.println("is folder1 Mon created:"+v1);

    File f2=new File("D:\\Weekdays1\\Tues");
    boolean v2=f2.mkdirs();
    System.out.println("is folder2 Tues created:"+v2);

    File f3=new File("D:\\Weekdays1\\Wednes");
    boolean v3=f3.mkdirs();
    System.out.println("is folder3 Wednes created:"+v3);

    File f4=new File("D:\\Weekdays1\\Thurs");
    boolean v4=f4.mkdirs();
    System.out.println("is folder4 Thurs created:"+v4);

    File f5=new File("D:\\Weekdays1\\Fri");
    boolean v5=f5.mkdirs();
    System.out.println("is folder5 Fri created:"+v5);

    File f6=new File("D:\\Weekdays1\\Satur");
    boolean v6=f6.mkdirs();
    System.out.println("is folder6 Satur created:"+v6);

    File f7=new File("D:\\Weekdays1\\Sun");
    boolean v7=f7.mkdirs();
    System.out.println("is folder7 Sun created:"+v7);

}
  private static void RenameWeekdays(){
          File f1=new File("D:\\Weekdays1\\Mon");
          File f11=new File("D:\\Weekdays1\\Monday");
          boolean v1= f1.renameTo(f11);
          System.out.println("is folder1 Monday created:"+v1);

          File f2=new File("D:\\Weekdays1\\Tues");
          File f22=new File("D:\\Weekdays1\\Tuesday");
          boolean v2=f2.renameTo(f22);
          System.out.println("is folder2 Tuesday created:"+v2);

          File f3=new File("D:\\Weekdays1\\Wednes");
          File f33=new File("D:\\Weekdays1\\Wednesday");
          boolean v3=f3.renameTo(f33);
          System.out.println("is folder3 Wednesday created:"+v3);

          File f4=new File("D:\\Weekdays1\\Thurs");
          File f44=new File("D:\\Weekdays1\\Thursday");
          boolean v4=f4.renameTo(f44);
          System.out.println("is folder4 Thursday created:"+v4);

          File f5=new File("D:\\Weekdays1\\Fri");
          File f55=new File("D:\\Weekdays1\\Friday");
          boolean v5=f5.renameTo(f55);
          System.out.println("is folder5 Friday created:"+v5);

          File f6=new File("D:\\Weekdays1\\Satur");
          File f66=new File("D:\\Weekdays1\\Saturday");
          boolean v6=f6.renameTo(f66);
          System.out.println("is folder6 Saturday created:"+v6);

          File f7=new File("D:\\Weekdays1\\Sun");
          File f77=new File("D:\\Weekdays1\\Sunday");
          boolean v7=f7.renameTo(f77);
          System.out.println("is folder7 Sunday created:"+v7);

      }
}
