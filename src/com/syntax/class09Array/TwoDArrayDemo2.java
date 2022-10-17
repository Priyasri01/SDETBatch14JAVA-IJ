package com.syntax.class09Array;

public class TwoDArrayDemo2 {
    public static void main(String[] args) {
        String[][] country={
                            {"usa", "canada"}, //first(row) array weth index 0
                            {"peru","Brazil","colombia","Ecuador"}, //2nd array/row with index 1
                            {"Ethiopia","Egypt","Kenya"},         //3nd array/row with index 2
                            {"Germany", "Turkiya","Moldova","Ukraine"}, //4nd array/row with index 3
                            {"Kazakshtan","Afghanistan", "Korea"}   //5nd array/row with index 4

                         } ;

        System.out.println(country.length); // result 5  -total number of arrays or row

        int elmOf1arr=country[0].length;// result 2 in here after "=" what it means is  we are asking compiler to go inside the first array and tell me the number of elments store in that array
        System.out.println("# of elements from 1 array =" +elmOf1arr);

        int elmOf2arr=country[1].length;// result 4 in here after "=" what it means is  we are asking compiler to go inside the 2 array and tell me the number of elments store in that array
        System.out.println("# of elements from 2 array ="+elmOf2arr);

        int elmOf3arr=country[2].length;// result 3 in here after "=" what it means is  we are asking compiler to go inside the 3 array and tell me the number of elments store in that array
        System.out.println("# of elements from 3 array ="+elmOf3arr);

        int elmOf4arr=country[3].length;// result 4 in here after "=" what it means is  we are asking compiler to go inside the 4 array and tell me the number of elments store in that array
        System.out.println("# of elements from 4 array ="+elmOf4arr);

        int elmOf5arr=country[4].length;// result 3 in here after "=" what it means is  we are asking compiler to go inside the 5 array and tell me the number of elments store in that array
        System.out.println("# of elements from 5 array ="+elmOf5arr);

        //how to access all elments in 2D array by using nested loop

        System.out.println("Getting all values from 2D array");

        for(int r=0; r<country.length;r++){

            for(int c=0; c<country[r].length;c++){

                System.out.print(country[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("*****************************enhance for loop***********************************************");

        for( String[] cout: country){

            for(String el:cout){

                if(el.equalsIgnoreCase("Kazakshtan")){

                    System.out.println("it's my home town");
                }

                System.out.print(el+ " ");
            }

            System.out.println();
        }
    }
}
