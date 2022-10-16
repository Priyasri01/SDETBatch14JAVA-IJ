package ReplitSamples;

public class Replit150 {
    /*
Create four classes (Person, Employee, Student, Retiree)
Have properties
For Person: name(String)

For Person: lastName(String)

For Person: age(int)

For Employee: salary(int)

For Student: grade(int)

For Retiree: seniorActivity(String)

At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

Create multilevel inheritance: Person --> Employee --> Student --> Retiree

From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

Expected Output:

Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour

     */
}
/*class Main03 {



}*/
 class Main04{

    public static void main(String[]args){


        Employer obj1= new Employer("Joe","Smith", 35,35000);
        obj1.method1();
        Student obj2= new Student("Adam","Smith", 15,10);
        obj2.method1();
        Retiree obj3= new Retiree ("Frank","Smith", 15,10,"touro");
        obj3.method1();


    }

}

class Person{

    String name;
    String lastName;
    int age;

    Person (String name,String lastName, int age){

        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
}
class Employer extends Person{
    int salary;

    Employer(String name, String lastName, int age, int salary){
        super(name,lastName, age); //in here person is parent class, so i used 3 parameter in spuer keyword.
        this.salary=salary;
    }

    void method1(){

        System.out.println(name + " "+ lastName+" "+age +" " +salary);
    }
}

class Student extends Employer{

    int grad;

    Student(String name, String lastName, int age ,int salary){ /*in here Employee is new parent class, so i am using 4 parameter in super */
        super(name,lastName,age,salary);
        this.grad=grad;


    }
    void method1(){

        System.out.println(name + " "+ lastName+" "+age+" " +grad);
    }
}
class Retiree extends Student{

    String seniorActivity;

    Retiree(String name , String lastName, int age,int salary,String seniorActivity){

        super(name,lastName,age,salary);

        this.seniorActivity=seniorActivity ;

    }

    void method1(){

        System.out.println(name + " "+ lastName+" "+age+" " +seniorActivity);
    }
}