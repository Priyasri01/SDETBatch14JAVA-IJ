package com.syntax.class09Array;

public class TwoDArrayTask02 {

    public static void main(String[] args) {

        /*Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
         * Then your program should print name of the students and their grade that has A and B grade
         */

        String[][] name= { {"priya", "mani","rose", "ram"},{"A","B","C","D"}};


        System.out.println(name[0][0] +" "+ name[1][0] + " and " + name[0][1]+" "+name[1][1]);
    }
}
