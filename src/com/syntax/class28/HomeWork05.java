package com.syntax.class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

public class HomeWork05 {
    public static void main(String[] args) {

        /*
        Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
         */

        ArrayList<Integer> value = new ArrayList<>();

        value.add(500);
        value.add(600);
        value.add(800);
        value.add(541);
        value.add(600);

        Integer sum=0;

        Iterator<Integer> iterator = value.iterator();

        while(iterator.hasNext()){

            sum+= iterator.next();
        }
        System.out.println("The sum of all the interger values  are: " +sum);
    }

    public static class FileDemo01WithMethod {

        public static void main(String[] args) throws IOException {
            // we want to have a method that can help us read data from properties file
            //this method should be available to any other class in project and once we pass
            // key it should give us its value


            System.out.println(property("passWord"));

        }


        public static String property(String key) throws IOException {
            String path="Data/config.properties";
            FileInputStream fis=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fis);
            return properties.getProperty(key);

        }
    }
}
