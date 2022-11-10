package com.syntax.class26;

import java.util.HashSet;
import java.util.Iterator;

public class HomeWork06 {
    public static void main(String[] args) {

        Student stu1= new Student("Ram", 1019);
        Student stu2= new Student("Peter",     357);
        Student stu3= new Student("Arun", 1916);

        HashSet<Student> has= new HashSet<>();

        has.add(stu1);
        has.add(stu2);
        has.add(stu3);

        Iterator<Student> iterator= has.iterator();

        while(iterator.hasNext()){

          Student name= iterator.next();

            name.name();
            name.id_no();

        }
    }
}
class Student {
    String studentName;
    int studentID;

    Student(String studentName, int studentID) {

        this.studentName = studentName;
        this.studentID = studentID;
    }
        void name(){

            System.out.println("StudentName:" +studentName);

        }
        void id_no(){

            System.out.println("StudentID#" +studentID);
        }

    }

