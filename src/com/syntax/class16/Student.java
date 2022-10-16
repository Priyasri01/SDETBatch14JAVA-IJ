package com.syntax.class16;

public class Student {

    /*
 Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */
    String name;
    String id;
    static int numberOfStudent;

    public static void main(String[] args) {
        Student st1= new Student(); //depending upon the number of object we can say number of student enrolled , because each object/instance created for  individual student.
        st1.id="1";
        st1.name="Ivan";
        Student.numberOfStudent++; /* since it's a static variable we call the variable through class name. note we can call directly by vairbale name or through object also.
                                     But it' s not good practice .Always we want to call  the  static variable by class name*/

        Student st2= new Student();
        st2.id="2";
        st2.name="Sonam";
        Student.numberOfStudent++;


        System.out.println(Student.numberOfStudent);

    }
}


