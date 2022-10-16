package com.syntax.class22;

public class StudentTester {
    public static void main(String[] args) {


        Student[] stu={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for(Student tester:stu){
//call the method
          tester.homwork();
          tester.Project();
          tester.ClassTime();
            System.out.println("****************************************************************");
        }

        /*
        you could also cast the object to its correct data type and then call the method, check the below code.
      if (students[i] instanceof SyntaxStudent)
                ((SyntaxStudent)students[i]).batch();
            else if (students[i] instanceof CollegeStudent)
                ((CollegeStudent)students[i]).college();
            else
                ((SchoolStudent)students[i]).school();
         */
    }
}
