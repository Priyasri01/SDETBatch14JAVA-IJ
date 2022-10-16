package com.syntax.class21;


//note: with the help of method overriding  , the child class will have their own implementation.
public class Empl01 {

    void calculateSalray() {

        System.out.println("1");
    }
}
    class dep extends Empl01{

    void calculateSalary(){

            System.out.println("2"); // if the method present inside the  child class and even they are inhertaint  java will priorities/refer the child class method first.
        }


    }

    class QADepartment extends dep {

    void calculateSalary(){

            System.out.println("3");
        }

        void main() //note in case if you want to have both output like parent method & child method value  then we can implicitly call the parent method inside the class by using super keyword check line 32.

        {
            super.calculateSalary();
            calculateSalary(); //note in case if we don't have the method inside the class when we serach for it, then java check the closet class for this class(in this it's dev class closet), then will provide the output.

        }
    }

    class Main{


        public static void main(String[] args) {

            QADepartment obj= new QADepartment();

       obj.main();

            System.out.println("***************************** we called both parentclass value(2) and child class value(3)*************************************************************************************");


       dep obj2= new dep();

          obj2.calculateSalary();
        }
    }

