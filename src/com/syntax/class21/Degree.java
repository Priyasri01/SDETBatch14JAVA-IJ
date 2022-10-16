package com.syntax.class21;

public class Degree {

    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes
     */

    void getPrerequisite(){

        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{


}
class Masters extends Bachelors{

    void getPrerequisite(){
        System.out.println("we will train you how to get the school diploma");
    }
}
