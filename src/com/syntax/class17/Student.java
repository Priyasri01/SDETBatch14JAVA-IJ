package com.syntax.class17;

public class Student {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
     Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
    private  String studentName;
    private  int subj1Grade;
    private int subj2Grade;
    private int subj3Grade;
    private int AverageGrade;
    private char grade;
    public  Student (String stName, int subj1 , int subj2, int subj3){ // this constructor

          studentName = stName;
          subj1Grade= subj1;
          subj2Grade= subj1;
          subj3Grade= subj1;

          System.out.print("Student Name is " + stName + "  and your grade is " );
    }
   public  void Average() { //this  method created to calculate the Average of  the mark

        AverageGrade = (subj1Grade + subj2Grade + subj3Grade) / 3;

        if (AverageGrade > 90) {
            grade = 'A';

        } else if (AverageGrade > 80) {
            grade = 'B';
        } else if (AverageGrade > 70) {
            grade = 'C';
        } else if (AverageGrade > 60) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println(grade);
    }



}
