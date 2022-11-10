package Reviwe08;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Josh","Plantin","123"));
        students.add(new Student("saira","Jawad","245"));
        students.add(new Student("Mihan","kalyani","123"));
        students.add(new Student("Josh","Plantin","123"));
        System.out.println(students);

        List<Student> liststudent= new ArrayList<>(students);
        System.out.println(liststudent.get(1));
    }
}
