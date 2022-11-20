package com.syntax.class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /*we need three things in order to write/read  a data
        right click on your file(under data dicertory) and click copypathreference then click form content root

         */

        String path="Data/config.properties"; //we get path of the file with intelliji

        FileInputStream fileInputStream = new FileInputStream(path); //it helps us navigate to the file

        Properties properties=new Properties(); //that special software which helps us to read from that file

        properties.load(fileInputStream); // loads all the data from the file inside(Memory)

        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("passWord"));
        fileInputStream.close();



    }
}
