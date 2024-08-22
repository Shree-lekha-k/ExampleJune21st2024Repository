package com.sgtesting.excelfolder;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class Assignment2 {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        FileOutputStream fout=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;
        try
        {
            wb=new XSSFWorkbook();
            sh=wb.createSheet("Sheet1");
                row = sh.createRow(9);
            for(int i=1;i<=20;i++) {
                cell = row.createCell(i-1);
                cell.setCellValue("Fruits"+i);
            }
            fout=new FileOutputStream("D:\\Excel\\Test2.xlsx");

            wb.write(fout);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
                wb.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

