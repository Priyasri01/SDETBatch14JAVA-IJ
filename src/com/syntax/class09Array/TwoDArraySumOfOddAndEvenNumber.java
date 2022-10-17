package com.syntax.class09Array;

public class TwoDArraySumOfOddAndEvenNumber {

    public static void main(String[] args) {

        /*
		 *  Create a 2D array of integers. Develop a program
			which will calculate the sum of even and odd numbers
			for that array. */

        int[][] num= {
                     {5,6,8,3},
                     {10,13,11,9},
                     {4,2,5,1}
                    };
        int SumOfOddNum=0;
        int SumOfEvenNum=0;


        for(int i=0; i<num.length;i++){

            for(int j=0; j<num[i].length; j++){

                if(num[i][j]%2==0){

                    SumOfEvenNum+=num[i][j];

                }else if(num[i][j]%2!=0){

                    SumOfOddNum+=num[i][j];
                }
            }
        }
        System.out.println("Sum of the Even Number in 2D Array are: " +SumOfEvenNum);
        System.out.println("Sum of the Even Number in 2D Array are: "+SumOfOddNum);

    }
}
