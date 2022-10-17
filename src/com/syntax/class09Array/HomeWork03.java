package com.syntax.class09Array;

public class HomeWork03 {
    public static void main(String[] args) {


        /*
		 * 3. Create an array on integers and calculate
		 * the sum of all elements in an array
		 */

        int[] num={10,20,30,40,50};

        int sum=0;

        for(int i=0; i<num.length;i++){

            sum+=num[i];
        }

        System.out.println(sum);

        System.out.println("************************enhance loop**************************************");

        int[] number={10,20,30,40,50};

        int sum1=0;

        for(int number1:number){

            sum1+=number1;
        }
        System.out.println(sum1);
    }
}
