package com.syntax.class14;

public class MethodsDemo2 {

    void printManyTimes(int times){
        for(int i=0; i<times;i++ ){
            System.out.println("Hello World");
        }
    }

    void printCustomWordManyTimes(String word,int times){

        for(int i=0 ; i<times;i++){
            System.out.println(word);

        }
    }

    public static void main(String[] args) {
        MethodsDemo2 obj =new MethodsDemo2();

        obj.printCustomWordManyTimes("syntax", 2); // in parameter sequence and data type matters
         //note u can't store the method in new variable.

    }
}
