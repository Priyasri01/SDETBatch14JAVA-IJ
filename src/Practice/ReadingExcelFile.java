package Practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelFile {

    public static void main(String[] args) throws IOException {
       //locate the file from harddrive where you store and store that file in the reference variable
        String path="Data/Test.xlsx";
//read the file from harddriver and brings to RAM IN RAW form 101010.in simple we can computer navigated to that file
        FileInputStream fileInputStream = new FileInputStream(path);

        //convert to excel
        XSSFWorkbook  xssfWorkbook= new XSSFWorkbook(fileInputStream);
//sheet that contains data
        Sheet sheet = xssfWorkbook.getSheet("sheet1");

        int noOfRows = sheet.getPhysicalNumberOfRows();

        for(int i=0; i<noOfRows;i++){

            Row row=sheet.getRow(i);
             int noOfCell= row.getPhysicalNumberOfCells();

             for(int j=0; j<noOfCell;j++){

                 Cell cell= row.getCell(j);
                 System.out.print(cell+ " ");
                 System.out.print("|");
             }

            System.out.println();
        }




    }
}
