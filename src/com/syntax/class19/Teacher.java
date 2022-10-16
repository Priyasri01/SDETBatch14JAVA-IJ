package com.syntax.class19;

public class Teacher {

    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes
     */
   protected  String techName; //protected is exactly like default, but protected properties you can use in the derived classes in different packages
    protected String department;
    protected String empID;
    protected char gender;
    protected int  experiance;

    public Teacher(String techName, String department, String empID, char gender, int experiance) {
        this.techName= techName;
        this.department = department;
        this.empID = empID;
        this.gender = gender;
        this.experiance = experiance;
    }

    void Programming(){

        System.out.println("Due to padamic currently they have only online programming");

    }
//note no argument constructor is user define
    void techSupport(String TechName){
        this.techName =TechName;

        System.out.println(TechName + " will avilable all the time");
    }

    void eventsDetails(){

        System.out.println("pelase contact " + department + " for the upcoming events");
    }

}

class MathTeacher extends Teacher {

    MathTeacher(String techName, String department, String empID, char gender, int experiance) {
        super(techName, department, empID, gender, experiance);

    }

    void depDetails() {

        System.out.println("This is " + department + "and you instructor is " + techName);
    }



}

class ChemistryTeacher extends Teacher {

    ChemistryTeacher(String techName, String department, String empID, char gender, int experiance) {
        super(techName, department, empID, gender, experiance);
    }

    void chemdepDetails() {

        System.out.println("This is " + department + "and you instructor is " + techName);
    }
}

class PianoTeacher extends Teacher {

    PianoTeacher(String TechName, String department, String empID, char gender, int experiance) {
        super(TechName, department, empID, gender, experiance);
    }

}

class Main{

    public static void main(String[] args) {

        MathTeacher tec1= new MathTeacher("peter","math department","am002",'f',5);
        tec1.depDetails();
        tec1.Programming();
        tec1.techSupport("Shopia");
        System.out.println("****************************************************************************************************************************");

        ChemistryTeacher tec2= new ChemistryTeacher("Raju","chemistry Department","am003",'M',10);
        tec2.techSupport("Shopia");
        tec2.chemdepDetails();





    }
}
