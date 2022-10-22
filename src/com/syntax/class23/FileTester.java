package com.syntax.class23;

public class FileTester {
    public static void main(String[] args) {

        File file = new JavaFile(); //doing upcasting
        file.open();
        file.edit();
        file.close();

        System.out.println("*********************************************");

        //calling all the method from all the class with the help of polymorphism

        File[] file1= {new WordFile(),new PdfFile()};

        for( File fil:file1){

            fil.open();
            fil.edit();
            fil.close();

            System.out.println("*********************************************");
        }

    }
}
