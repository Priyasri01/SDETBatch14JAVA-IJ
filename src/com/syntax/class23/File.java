package com.syntax.class23;

public abstract class File {

    /*
    Create a class File that will have the following behaviors: open, edit, close.
     Edit and close are implemented method while open is an abstract.
      Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
       Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

     */
   abstract  void open();
   //"we can open the file through the command or by GUI interface"

   void edit(){

       System.out.println("we can modify the file by using edit options");
   }


 void close(){

     System.out.println("we can close the file by using close options");
 }
}
class JavaFile extends File {

    @Override
    void open() {

        System.out.println("we can open the jave file  with help of IDE like eclipse, Intellij");
    }
}
class WordFile extends File{


    @Override
    void open() {
        System.out.println("we need to have microsoft office to open the word file");
    }

}class PdfFile extends File{


    @Override
    void open() {

        System.out.println("we can open the PDF file with the help of PDF Reader and Editor like Adobe");
    }
}
