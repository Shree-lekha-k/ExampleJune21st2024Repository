package com.sgtesting.excelfolder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assignment7{
    public static void main(String[] args) {
        readWriteContent();
    }

    private static void readWriteContent()
    {
        FileInputStream fin=null;
        FileOutputStream fout=null;
        Workbook wb=null;
        Sheet sh1=null;
        Sheet sh2=null;
        Row rowsh1=null;
        Row rowsh2=null;
        Cell cellsh1=null;
        Cell cellsh2=null;
        try
        {
            fin=new FileInputStream("D:\\Excel\\Test7.xlsx");
            wb=new XSSFWorkbook(fin);
            sh1=wb.getSheet("Sheet1");
            sh2=wb.getSheet("Sheet2");
            if(sh2==null)
            {
                sh2=wb.createSheet("Sheet2");
            }

            int rc=sh1.getPhysicalNumberOfRows();
                String[] s=new String[rc];
            for(int r=0;r<rc;r++)
            {
                rowsh1 = sh1.getRow(r);
                rowsh2 = sh2.getRow(r);
                if (rowsh2 == null) {
                    rowsh2 = sh2.createRow(0);
                }
                int cc = rowsh1.getPhysicalNumberOfCells();
                for (int c = 0; c < cc; c++) {
                    cellsh1 = rowsh1.getCell(c);
                    String data = cellsh1.getStringCellValue();
                    s[r] = data;
                }
            }
                 for(int j=0;j<rc;j++)
                 {
                    cellsh2=rowsh2.getCell(j);
                    if(cellsh2==null)
                    {
                        cellsh2=rowsh2.createCell(j);
                        cellsh2.setCellValue(s[j]);
                }
            }
            fout=new FileOutputStream("D:\\Excel\\Test7.xlsx");
            wb.write(fout);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
                fout.close();
                wb.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
