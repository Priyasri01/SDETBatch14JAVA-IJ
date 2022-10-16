package com.syntax.class18;

public class ThisKeywordDemo {

    String str="Red";

    void print(){
       String  str="Blue";
        System.out.println(str);
        System.out.println(this.str); // we are calling instant variable by using this keyword.


    }

    public static void main(String[] args) {
         new ThisKeywordDemo().print();
    }
}
