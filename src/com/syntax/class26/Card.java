package com.syntax.class26;

abstract class Card {
    /*
    Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
    Create 3 subclasses of a Card card.
    Create 3 objects of different card and store them into LinkedList.
     Using for loop/advanced for loop/ iterator access all methods of the class.
     */

    String cardType;

    Card(String cardType) {
        this.cardType = cardType;
    }

    void oneTimeFee() {

        System.out.println(cardType + " is 2022’s best secured card because it has a $0 annual fee and gives good rewards on purchases");
    }

    abstract void mindeposit();
}
    class Chase extends Card{

        Chase(String cardType){
            super(cardType);
        }

        @Override
        void mindeposit() {
            System.out.println("The minimum deposit for Chase  Secured Credit Card – $200 ");
        }
    }
    class CapitalOne extends Card{

        CapitalOne(String cardType){

            super(cardType);
        }

        @Override
        void mindeposit() {

            System.out.println("Minimum deposit for CapitalOne Secured Credit Card  $49,$99 or $200, depending on the specifics of your credit history and the current state of your finances. ");

        }
    }
    class Citi extends Card {

        Citi(String cardType) {
            super(cardType);
        }

        @Override
        void mindeposit() {

            System.out.println("Minimum deposit for Citi Secured Credit Card  requires a refundable security deposit of just $200.");

        }
    }










