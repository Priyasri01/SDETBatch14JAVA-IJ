package util;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ExcelReader {

    public static ArrayList<LinkedHashMap<String, String>> read(String path) throws IOException {
        /*we created this method so that everytime we need to read the data from Excel
    file we can reuse this method by just passing the path in side the ().*/
        FileInputStream fis = new FileInputStream(path);

        // Special class that helps us read and write data to an Excel file.
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        Sheet sheet = excel.getSheet("Sheet1");
        int noOfRow = sheet.getPhysicalNumberOfRows();
        // getting the first row so that we can use it as keys for our map
        Row headerRow = sheet.getRow(0);
        // the ArrayList that will store the data for each row(map)
        ArrayList<LinkedHashMap<String, String>> excelData = new ArrayList<>(); // a list that can hold maps

        // A loop that goes through all the rows that contain the data.
        for (int rowNo = 1; rowNo < noOfRow; rowNo++) {
            //created Map that will store the data for each row
            LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();
            // get a dataRow from sheet one by one through loop
            Row dataRow = sheet.getRow(rowNo);
            // getting the count of how many cells contain the data
            int noOfCell = dataRow.getPhysicalNumberOfCells();
            // A loop to go through all the cells
            for (int cellNo = 0; cellNo < noOfCell; cellNo++) {

                //getting keys from header row and values from data row
                String key = headerRow.getCell(cellNo).toString();
                String value = dataRow.getCell(cellNo).toString();
                rowMap.put(key, value); //store the data in map
            }
            excelData.add(rowMap); //store the each map data in Arraylist



        }
        return excelData;
    }

}



