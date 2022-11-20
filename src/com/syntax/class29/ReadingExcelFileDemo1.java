package com.syntax.class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelFileDemo1 {
    public static void main(String[] args) throws IOException {

        //Location of the file on your HardDrive where file is stored.
        String path="Data/Test.xlsx";
        /*Read the data from HrdDrive brings it to RAM in raw from 10101010
        in simple words we can say computer has navigated to that file
         */
        FileInputStream fis = new FileInputStream(path);
        /*
        this class converts the raw bytes to excel format or in simple words it is that special software
        that helps us read and write data to an excel file
         */
        XSSFWorkbook excel= new XSSFWorkbook(fis);
        Sheet sheet = excel.getSheet("Sheet1");
        int noOfRow=sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < noOfRow; i++) {
            Row row = sheet.getRow(i);
            int noOfCell= row.getPhysicalNumberOfCells();
            for(int j=0;j<noOfCell; j++){

              //  System.out.print(row.getCell(j) + " ");

            }
         //she   System.out.println();
            
        }
       
        



    }
}
