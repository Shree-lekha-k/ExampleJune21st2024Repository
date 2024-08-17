package com.sgtest.serialization;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAlternate {
    public static void main(String[] args){
        readAlternate();
        }
        private static void readAlternate() {

            FileReader fr=null;
            BufferedReader br=null;
            try
            {
                fr=new FileReader("E:\\Demo3\\Sample3.txt");
                br=new BufferedReader(fr);

                String[] sLine = new String[10];
                int count = 0;
                String line;
                while ((line = br.readLine()) != null && count < sLine.length) {
                    sLine[count++] = line;
                }
                for (int i = 0; i < sLine.length ; i+=2) {
                    if (sLine[i] != null) {
                        System.out.println(sLine[i]);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
}
