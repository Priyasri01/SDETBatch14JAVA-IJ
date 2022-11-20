package com.syntax.class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {

        String path ="Data/Test.xlsx";
         /*Read the data from HrdDrive brings it to RAM in raw from 10101010
        in simple words we can say computer has navigated to that file
         */
        FileInputStream fileInputStream = new FileInputStream(path);
        //we used here a special class that can load/handle xlsx files
        XSSFWorkbook excelFile= new XSSFWorkbook(fileInputStream);
        //opening the sheet in which we have data with the help of getSheet()method
        Sheet sheet = excelFile.getSheet("Sheet1");

        // returns how many rows in actual contains the data in sheet
        int noOfRows = sheet.getPhysicalNumberOfRows();

        // A loop that goes through all the rows that contain the data.
        for(int i=0; i<noOfRows;i++){
            // get a data from particular  Row  one by one through loop on the each iterator and stored in row variable.
            Row row = sheet.getRow(i);
            // getting the count of how many cells contain the data
            int noOfCell=row.getPhysicalNumberOfCells();
          //Inner loop which will go through all the cells
            for(int j=0;j<noOfCell;j++){
              // // get a data from particular cell one by one through loop on the each iterator and stored in cell variable.
             Cell cell= row.getCell(j);
                System.out.print(cell + " ");
                System.out.print("|");


            }

            System.out.println();



        }




    }
}
