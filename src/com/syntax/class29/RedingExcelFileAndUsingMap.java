package com.syntax.class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class RedingExcelFileAndUsingMap {
    public static void main(String[] args) throws IOException {
        //Location of the file on your HardDrive where file is stored.
        String path="Data/Test.xlsx";
        /*Reads the data from HardDrive brings it to RAM in the raw form 10101010101010
       In simple words we can say computer has navigated to that file */
        FileInputStream fis=new FileInputStream(path);
        /*this class converts the raw bytes to Excel format or in simple words it is that special software
         that helps us read and write data to an Excel file. */
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        //opening the sheet in which we have data with the help of getSheet()method
        Sheet sheet= excel.getSheet("Sheet1");
        int noOfRow=sheet.getPhysicalNumberOfRows();
        // getting the first row so that we can use it as keys for our map
        Row headerRow= sheet.getRow(0);
        ArrayList<LinkedHashMap<String,String>>excelData= new ArrayList<>(); // a list that can hold maps, we stored in arraylist because it's faster and we retrive data through index.
        // A loop that goes through all the rows that contain the data.
        for (int rowNo = 1; rowNo < noOfRow; rowNo++) {
            // the Map that will store the data for each row
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();
            // get a data from particular  Row  one by one through loop on the each iterator and stored in dataRow variable.
            Row dataRow=sheet.getRow(rowNo);
            // getting the count of how many cells contain the data
            int noOfCell=dataRow.getPhysicalNumberOfCells();
            // A loop to go through all the cells
            for (int cellNo = 0; cellNo < noOfCell; cellNo++) {

                //getting keys from header row and values from data row and store in teh variable
                String key=headerRow.getCell(cellNo).toString();
                String value=dataRow.getCell(cellNo).toString();
                rowMap.put(key,value);
            }

            excelData.add(rowMap); //store  each row(map) inside the arraylist in each iteration.

        }

        System.out.println(excelData);

    }



    }

