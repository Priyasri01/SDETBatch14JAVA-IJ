package com.syntax.class28;

public class PersonMap {
   /* Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor.
    Inside the class also create a method to print user details.
    In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.*/

//created private feild
 private String name;
 private String lastName;
   private int age;
   private double salary;

//created constructor
    public PersonMap(String name,String lastName, int age, double salary) {
    setName(name);
    setLastName(lastName);
    setAge(age);
    setSalary(salary);

    }
    //note since we created all the filed as private , we created getter and setter method to control on
  public  void setName(String name){
     //we pass some condition for the name feild
        if(name.isEmpty()){

            System.out.println("name feild can't be empty");
        }else{

            this.name=name;
        }
    }

    String getName(){

        return name;
    }


public void setLastName(String lastName){

        this.lastName=lastName;
}

String getLastName(){

        return lastName;
}

public void setAge(int age){

        this.age=age;
}


int age(int age){

        return age;

}
public void setSalary(double salary){

        this.salary=salary;
}

double getSalary(){
        return salary;
}

 void printDetails(){

    System.out.println(name + " "+lastName+" "+ age + " "+ salary);

    }
}

