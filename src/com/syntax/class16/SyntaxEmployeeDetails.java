package com.syntax.class16;

public class SyntaxEmployeeDetails {  // in this class we created two object for "SyntaxEmployee" class
    /*
    Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */

    public static void main(String[] args) {
        SyntaxEmployee asgharEmp =new SyntaxEmployee();
        asgharEmp.empId="123";
        asgharEmp.salary=100000;


        System.out.println(SyntaxEmployee.CEO); //note when ever we call static variable , we have to call through class name.
        System.out.println(asgharEmp.empId); //this is not static variable, so we called through obj name

        SyntaxEmployee moazzamEmp =new SyntaxEmployee();
        moazzamEmp.empId="123";
        moazzamEmp.salary=100000;

        System.out.println(SyntaxEmployee.CEO);
        System.out.println(moazzamEmp.empId + "\n" + moazzamEmp.salary); // "\n" means next line.


    }



}
