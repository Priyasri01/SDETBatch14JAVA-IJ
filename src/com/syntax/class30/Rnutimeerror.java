package com.syntax.class30;

public class Rnutimeerror {
    public static void main(String[] args) {

        temptaureCheck(70);
    }

    public static void temptaureCheck(int temp) {
        if (temp<32){
            throw new RuntimeException("It is freezing");
        }

        else if(temp>60){

            throw new ArrayIndexOutOfBoundsException("Index out of bond");
        }

    }


}

