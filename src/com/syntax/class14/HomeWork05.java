package com.syntax.class14;

public class HomeWork05 {

    /*Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or */

  String  createEmail(String firstName, String lastName,String emailType ){

       return (firstName+lastName+"@"+emailType+".com");

    }

    public static void main(String[] args) {

        HomeWork05 obj= new HomeWork05();

        String fullEmail=obj.createEmail("Peter", "Raj","aol");
        System.out.println(fullEmail);
        System.out.println(obj.createEmail("Seetha", "Murugan","gmail"));
    }
}
