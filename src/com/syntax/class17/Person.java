package com.syntax.class17;

public class Person {

        String name;
        String color;
        String country;
        int age;
        double weight;
        String hairColor;
        String eyeColor;
        double height;
        static char gender='M';


        public Person(){ // note based on the requirements ,  we can have multiple constructor  either with default constructor or parameterized constructor.

        }

        public Person(String perName){ // this also constructor, parameterized constructor.

            name=perName;

            System.out.println(name);
        }

        public Person(String name, String color, String country, int age, double weight, String hairColor, String eyeColor, double height, char gender) { //this also constructor, parameterized constructor.
            this.name = name; // just
            this.color = color;
            this.country = country;
            this.age = age;
            this.weight = weight;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.height = height;
            this.gender = gender;
        }

        public static void main(String[] args) {
            Person person=new Person(); // this is default constructor
            Person person2=new Person("Asma"); // this is parameterized constructor.
           // Scanner scanner=new Scanner(System.in);

        }
}
