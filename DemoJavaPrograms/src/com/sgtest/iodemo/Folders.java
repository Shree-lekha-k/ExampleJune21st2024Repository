package com.sgtest.iodemo;

import java.io.File;

public class Folders {
    public  static void main(String[] args){
        getfolder();
    }
    private static void getfolder(){
        File f1=new File("D://JavaFolders");
        File[] f2=f1.listFiles();
        for(int i=0;i<f2.length;i++){
             if(f2[i].isDirectory()==true){
                 String path=f2[i].getAbsolutePath();
                 System.out.println(path);
             }
        }
    }
}
