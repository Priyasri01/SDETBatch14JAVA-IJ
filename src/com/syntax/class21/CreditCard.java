package com.syntax.class21;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */

   static double balance;
   static double interest;
    static double calculateInterest;

    CreditCard(double balance,double interest){

        this.balance=balance;
        this.interest=interest;

    }
    public static  void  meth1(){

        calculateInterest =  balance * (interest/100);
        System.out.println("your this month interest rate is $"+interest +" "+ calculateInterest);
    }
}
class Visa extends CreditCard{

    Visa(double balance , double interest){
        super(balance, interest);
    }

}
class AX extends Visa{

    AX(double balance , double interest){
        super(balance, interest);
    }

 public static void meth1(){

        calculateInterest = balance * (interest/100);
    System.out.println("your this month interest rate is $"+interest +" " +calculateInterest);

    }

}