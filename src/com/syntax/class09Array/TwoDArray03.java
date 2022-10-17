package com.syntax.class09Array;

public class TwoDArray03 {

    public static void main(String[] args) {

        String [][]  name= {{"priya", "mani","rose", "ram"},
                             {"A","B","C","D"}};




        for(String[] singleArray:name){ //loop over 1D array or single array

            for(String el:singleArray){ //loop over each element of the 1D array

                System.out.print(el+ " ");
            }

            System.out.println();
        }

        System.out.println("********************************Regular for loop*****************************************************");

        for(int i=0; i<name.length;i++){ // control the  number of iteration process outer loop iterate  over row

            for(int j=0; j<name[i].length;j++){ //inner loop iterate over column, basically  asking in the particular array[i].how many elements stored which is column
                System.out.print(name[i][j] + " ");
            }

            System.out.println();
        }
    }
}
