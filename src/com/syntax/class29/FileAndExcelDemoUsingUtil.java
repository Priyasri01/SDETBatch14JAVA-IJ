package com.syntax.class29;

import util.ConfigReader;
import util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class FileAndExcelDemoUsingUtil {

    public static void main(String[] args) throws IOException {

        String path="Data/config.properties";
    Properties properties =ConfigReader.read(path);

        System.out.println(properties.getProperty("browser"));


        String excelPath ="Data/Test.xlsx";
       List<Map<String,String>> excelDate = ExcelReader.read(excelPath); //calling the ReadMethod to get excel data
       // System.out.println(excelDate);
        System.out.println(excelDate.get(1)); //get the data from the first row
      Map<String,String> map= excelDate.get(2); // get the data from second row return type is LinkedHashMap<String,String> , because in read method we store each row in LinkedHashMap.
        System.out.println(map.get("Age"));
        System.out.println(map.get("LastName"));
    }
}
