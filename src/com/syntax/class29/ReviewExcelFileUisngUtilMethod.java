package com.syntax.class29;

import util.ExcelReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ReviewExcelFileUisngUtilMethod {

    public static void main(String[] args) throws IOException {

        /*
        we want to read data from Test1 excel file
         */
    String path= "Data/Test1.xlsx";

    ArrayList<LinkedHashMap<String,String>> exceldata= ExcelReader.read(path);

        System.out.println(exceldata);
        LinkedHashMap<String,String> name=exceldata.get(0);
        System.out.println("your Java Instructor is " +name.get("Instructor"));
    }
}
