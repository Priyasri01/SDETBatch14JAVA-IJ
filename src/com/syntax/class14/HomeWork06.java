package com.syntax.class14;

public class HomeWork06{

    //Write a method to return whether given number is prime or not?


    boolean isPrime(int num){
        boolean isPrime=true;
        if(num>1){
            for(int i=2; i<num; i++){
                if(num%i==0){
                    isPrime=false;
                }
            }
        }else{
            isPrime=false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
       HomeWork06 task6=new HomeWork06();
        System.out.println(task6.isPrime(12));
    }

}
