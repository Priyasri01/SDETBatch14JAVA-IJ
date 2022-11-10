package Reviwe08;

import java.util.ArrayList;

public class StudentTester {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ram", "charan", "123"));
        students.add(new Student("Priya", "Peter", "586"));
        students.add(new Student("Dhyna", "Dev", "187"));
        students.add(new Student("Hari", "Veera", "205"));
        students.add(new Student("Archana", "Muru", "1111"));


       /* System.out.println(students);

        for (Student student : students) {

            student.printName();

        }*/

        System.out.println(students.size());
        Student student= new Student("Ram", "charan", "123");
        System.out.println(students.contains(student));
        System.out.println(student);
        System.out.println(students);

    }
}
