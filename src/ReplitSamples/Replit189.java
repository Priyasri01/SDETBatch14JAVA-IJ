package ReplitSamples;

import java.util.Iterator;
import java.util.LinkedList;

public class Replit189 {

    public static void main(String[] args) {

        /*
        Create a Linked List that will store Integer Objects from 50-100.

Once Linked List is created remove all numbers that are not divisible by 3.

Print Linked List

Expected Output

[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
         */


        LinkedList<Integer> number= new LinkedList<>();

        for(int i=51; i<100; i++){

            number.add(i);


        }
        Iterator<Integer> iterator = number.iterator();

        while(iterator.hasNext()){

            Integer num =iterator.next();

            if(num%3!=0){

                iterator.remove();
            }

        }

        System.out.println(number);



    }
}

