package com.syntax.class29;

import util.ExcelReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ReadingExcelFileDemo2Util {
    public static void main(String[] args) throws IOException {

        ArrayList<LinkedHashMap<String,String>> allExcelData=   ExcelReader.read("Data/Test.xlsx");// just call the "read method"which we created in util package.

        System.out.println(allExcelData);

      // System.out.println(ExcelReader.read("Data/Test.xlsx"));  both 12 & 14 will provide the same out put

        // since we created read method as static in ExcelReader class which is in util package.
        // we can call directly the method  with the class name(ExcelReader).

    }

    }

