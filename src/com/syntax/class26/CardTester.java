package com.syntax.class26;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTester {

    public static void main(String[] args) {

    Chase chBank= new Chase("Chase-Bussiness secured Credit Card");
    CapitalOne capone= new CapitalOne("CapitalOne-Bussiness secured Credit Card");
    Citi  citi= new Citi("Citi-Bussiness secured Credit Card");

    LinkedList<Card> cardDetails = new LinkedList<>();

    cardDetails.add(chBank);
    cardDetails.add(capone);
    cardDetails.add(citi);




  //retrieve  all the method by using all three loops


        for(int i=0; i<cardDetails.size();i++){

            cardDetails.get(i).oneTimeFee();
            cardDetails.get(i).mindeposit();
            System.out.println("================================");


        }
        System.out.println("**********************enhance loop****************************");

        for(Card ca:cardDetails){

            ca.oneTimeFee();
            ca.mindeposit();
            System.out.println("================================");

        }

        System.out.println("**********************iterator loop****************************");

        Iterator<Card> iter= cardDetails.iterator();

        while(iter.hasNext()){

            Card nam= iter.next(); //get the next elements/object and store it in Card class.
           nam.oneTimeFee();
         nam.mindeposit();
            System.out.println("================================");


        }

    }
}
