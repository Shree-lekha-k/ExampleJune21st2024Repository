package com.sgtest.iodemo;

import java.io.File;

public class CreateSubFolders {
    public static void main(String ars[]) {
        Createfolders();
    }
        private static void Createfolders(){
            File f1=new File("D:\\JavaFolders\\Folder1");
            boolean v1=f1.mkdirs();
            System.out.println("is folder1 created:"+v1);

            File f2=new File("D:\\JavaFolders\\Folder2");
            boolean v2=f2.mkdirs();
            System.out.println("is folder2 created:"+v2);

            File f3=new File("D:\\JavaFolders\\Folder3");
            boolean v3=f3.mkdirs();
            System.out.println("is folder3 created:"+v3);

            File f4=new File("D:\\JavaFolders\\Folder4");
            boolean v4=f4.mkdirs();
            System.out.println("is folder4 created:"+v4);

            File f5=new File("D:\\JavaFolders\\Folder5");
            boolean v5=f5.mkdirs();
            System.out.println("is folder5 created:"+v5);

            File f6=new File("D:\\JavaFolders\\Folder6");
            boolean v6=f6.mkdirs();
            System.out.println("is folder6 created:"+v6);

            File f7=new File("D:\\JavaFolders\\Folder7");
            boolean v7=f7.mkdirs();
            System.out.println("is folder7 created:"+v7);

            File f8=new File("D:\\JavaFolders\\Folder8");
            boolean v8=f8.mkdirs();
            System.out.println("is folder8 created:"+v8);

            File f9=new File("D:\\JavaFolders\\Folder9");
            boolean v9=f9.mkdirs();
            System.out.println("is folder9 created:"+v9);

            File f10=new File("D:\\JavaFolders\\Folder10");
            boolean v10=f10.mkdirs();
            System.out.println("is folder10 created:"+v10);
        }

}
