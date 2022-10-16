package com.syntax.class16;

public class BankAccount { // note in file/class if we have multiple class, then only one class will public which is the first one , therefore line 3 is public class and line 27 is default class.

    private String username;
    private String password;
    int accountNumber;
    public String bankName;

    public void printBankName(){ // we have public access modifier for this method , meaning it can access from any package and any class within same project.
        System.out.println(bankName);
    }

    private  void printUserName(){ // it's private access modifier, this can access only with in this class , since it's private access modifier.
        System.out.println(username);
    }



    void printAccountNumber(){ //it's default access modifier , this can access in  any class within same package
        System.out.println(accountNumber);
    }



}
class BankDetails {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount();

        obj.printBankName();
        obj.printAccountNumber();
      //  obj.printUserName(); // note this will give compiler error, because ".printUserName()" method is created as private access modifier  in "BankAccount" class.


    }
}
