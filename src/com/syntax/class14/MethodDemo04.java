package com.syntax.class14;

public class MethodDemo04 {

    boolean myStery(){

        return false;
    }

    String mystery(int num){

        return "c++";
    }

    String method(String word){

        return "java";
    }

    String met(String word){

        if(word.equals("Java")){

            return "java";
        }else{

            return "Python";
        }
    }



    public static void main(String[] args) {

        MethodDemo04 method = new MethodDemo04();
        System.out.println(method.myStery());
        System.out.println(method.mystery(10));
        System.out.println(method.method("Python")); //result Java , because we did call wordj
        System.out.println(method.met("Python"));
    }

}
