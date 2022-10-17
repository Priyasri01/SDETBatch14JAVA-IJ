package com.syntax.class09Array;

public class Task01 {

    /*
     * Create an array of chars and store grades into it: A,B,C,D,E,F.
     * Then print a grade B
     * (use 2 different ways of creating an array).
     */
    public static void main(String[] args) {

        char[] name= new char[6];

        name[0]='A';
        name[1]='B';
        name[2]='c';
        name[3]='d';
        name[4]='e';
        name[5]='f';

        System.out.println(name.length);
        System.out.println(name[1]);

        System.out.println("*******************************************************");

        char[] name1= {'A','B','C','D','E','F'};
        System.out.println(name1[1]);

        }
    }


