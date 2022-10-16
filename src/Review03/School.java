package Review03;

import static Review03.Teacher.work;

public class School {

    public static void main(String[] args) {


        Teacher t = new Teacher("John", "Smith");
        System.out.println(t.name);

        Teacher t1 = new Teacher("Jane", "Smith", "Biology");
        t1.teach();

        Teacher t2 = new Teacher("Jack", "Smith", 5);

        Teacher.school = "Syntax";

        work(); // this will give error  in case if we not import, because static method is within same calss. so if u want to call to different calss then you need to import.
        System.out.println(t2.getBonus());


    }
}