package com.syntax.class09Array;

public class Task02 {

    public static void main(String[] args) {

        /*
         * Create an array of names and store all names of your group.
         * Then print your name from that array.
         * (use 2 different ways of creating an array).
         *
         *
         */

        String[] nameofGroup = new String[3];

        nameofGroup[0]="Ram";
        nameofGroup[1]="Peter";
        nameofGroup[2]="Priyasri";

        System.out.println(nameofGroup[2]);

        System.out.println("**************************************************");

        String[] nameofgroup1= {"rose", "ram","Priyasri"};
        System.out.println(nameofgroup1[2]);
    }
}
