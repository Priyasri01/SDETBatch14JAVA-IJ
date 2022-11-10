package ReplitSamples;

import java.util.Iterator;
import java.util.LinkedList;

public class Replit192 {

    /*  Create an Linked List that will store all prime numbers from 1 to 100

      Step 1. Create a method that will identify wether number is prime or not

      Step 2. Add all prime numbers into Linked List

      Print Linked List:

      Expected Output:

              [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97] */
    public static void main(String[] args) {


        LinkedList<Integer> number = new LinkedList<>();

        for (int i = 1; i <= 100; i++) {

            number.add(i);

        }

        Iterator<Integer> iterator = number.iterator();


        while (iterator.hasNext()) {

            Integer num = iterator.next();


            if (num > 1) {

                for (int j = 2; j < 100; j++) {

                    if (num % 2 == 0) {

                        iterator.remove();
                    }else{
                        System.out.println(num);
                    }
                }

            } else {

                System.out.println("It's not prime number");


            }




        }
    }
}

   /* void isPrime_no(){

        LinkedList<Integer> number= new LinkedList<>();

        for(int i=1; i<=100; i++) {

            number.add(i);

        }

        Iterator<Integer> iterator = number.iterator();
        boolean isPrime=true;

        while(iterator.hasNext()){

            Integer num= iterator.next();


        if(num>1){

           for(int j=2; j<100;j++){

               if(num%2==0){

                   iterator.remove();
               }
           }
        }else{

            isPrime=false;


             }

            System.out.println(num);






        } */



