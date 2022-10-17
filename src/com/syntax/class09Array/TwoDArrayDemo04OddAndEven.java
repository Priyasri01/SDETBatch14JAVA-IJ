package com.syntax.class09Array;

public class TwoDArrayDemo04OddAndEven {
    public static void main(String[] args) {

        /*
		 * Create a 2D array of integer type where you will store
			odd and even numbers. Develop a program which will
			identify/print the even numbers only. */

        int[][] num={ {10,3,30,19},
                        {5,50,60,25},
                        {1, 17, 18, 7}
                    };

        for(int i=0; i<num.length; i++){

            for(int j=0; j<num[i].length; j++) {

                if (num[i][j] % 2 == 0) {

                    System.out.print(num[i][j] + " ");
                }
            }

            }
        System.out.println();
            System.out.println("***********************************enhance for loop***********************************");

            for( int[] number: num){

                for( int nu: number){

                    if(nu%2==0) {

                        System.out.print(nu + " ");

                    }
                }
            }
        }
    }

