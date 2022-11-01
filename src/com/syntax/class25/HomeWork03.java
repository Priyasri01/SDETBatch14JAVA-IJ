package com.syntax.class25;
import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork03 {
    public static void main(String[] args) {
       /* Create an arrayList of even numbers from 1 to 500.
        Remove any number that is divisible by 5 from that arrayList.*/

        ArrayList<Integer> evenNum = new ArrayList<>(250);
        for(int i=1;i<=500;i++){

            if(i%2==0){

                evenNum.add(i);
            }

        }
        System.out.println(evenNum);
        System.out.println("The size of this ArrayList is " + evenNum.size());

        Iterator<Integer> finalNum= evenNum.iterator();

        while(finalNum.hasNext()){

            int number= finalNum.next();

            if(number%5==0){

              finalNum.remove();
            }
            }
        System.out.println("Number that are not divisible by 5 are :");
        System.out.println(evenNum);
        }

    }

