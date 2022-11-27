package com.syntax.class29;

import util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ReviewExcelFileUisngUtilMethod {

    public static void main(String[] args) throws IOException {

        /*
        we want to read data from Test1 excel file
         */
    String path= "Data/Test1.xlsx";

    List<Map<String, String>> exceldata= ExcelReader.read(path);

        System.out.println(exceldata);
       Map<String,String> name=exceldata.get(0);
        System.out.println("your Java Instructor is " +name.get("Instructor"));
    }
}
