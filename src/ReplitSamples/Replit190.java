package ReplitSamples;

import java.util.Iterator;
import java.util.LinkedList;

public class Replit190 {
    /*
    Create Linked List that will store first 10 numbers of fibonacci series

Print number from Linked List 1 by 1 all in 1 line

Expected Output:

0 1 1 2 3 5 8 13 21 34
     */

    public static void main(String[] args) {
        LinkedList<Integer> fibonacci = new LinkedList<>();

        int perviousNum=0;
        int currentNum=1;
        int nextNum=0;
        fibonacci.add(nextNum);
        fibonacci.add(1);
        for(int i=0;i<8; i++){

            nextNum=perviousNum+currentNum;
            fibonacci.add(nextNum);
            perviousNum=currentNum;
            currentNum=nextNum;
        }

        Iterator<Integer> iterator= fibonacci.iterator();

        while(iterator.hasNext()){

            Integer num =iterator.next();
            System.out.print(num + " ");
        }

    }
}
