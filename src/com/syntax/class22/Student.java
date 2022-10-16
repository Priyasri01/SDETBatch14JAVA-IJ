package com.syntax.class22;

public class Student {

    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */

    void homwork(){

        System.out.println("Student always need to submit the homework on time");
    }
    void Project(){

        System.out.println("Project is the keypoint for understanding the concept");
    }

    void ClassTime(){

        System.out.println("Monday to friday from 9  to 4 clock");
    }
}

class SyntaxStudent extends Student{

   @Override
    void homwork(){

        System.out.println("Student always need to submit the homework on the homework channel");
    }
    @Override //it's just an annotation to check if we properly overriding the method or not
    void Project(){

        System.out.println("Project is the keypoint for understanding the concept, so every month ones we have group project");
    }

    void ClassTime(){

        System.out.println("Tuesday to thrusay 7 to 10 PM");
    }
}


class CollegeStudent extends Student{

    void homwork(){

        System.out.println("Student always need to submit the homework through canvas");
    }
    void Project(){

        System.out.println("Project is the keypoint for understanding the concept,during the final semister we will have the project more");
    }

    void ClassTime(){

        System.out.println("Moday to firday , saturday is optional");
    }
}
class SchoolStudent extends Student{

    void homwork(){

        System.out.println("School Student get more homework than  college student");
    }
    void Project(){

        System.out.println("Shool student won't get more project than college student");
    }

    void ClassTime(){

        System.out.println("only from monday to friday");
    }
}