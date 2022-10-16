package com.syntax.class15;

public class SyntaxEmpyTester {

    public static void main(String[] args) {


        SyntaxEmployee asgharEmp = new SyntaxEmployee();

        asgharEmp.empID="123 ";
        asgharEmp.salary= 120000.00;


        SyntaxEmployee mozzamEmp = new SyntaxEmployee();

        mozzamEmp.empID= "456 ";
        mozzamEmp.salary=1000000.00;

        System.out.println(mozzamEmp.empID + "your salary " +   mozzamEmp.salary);
        System.out.println(mozzamEmp.empID + "your salary " +   mozzamEmp.salary);

    }
}