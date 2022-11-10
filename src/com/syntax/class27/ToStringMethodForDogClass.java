package com.syntax.class27;

import java.util.ArrayList;

public class ToStringMethodForDogClass {
    public static void main(String[] args) {

        ArrayList<Dog> dogs= new ArrayList<>();
        dogs.add(new Dog("Tommy","Black","german")); //note we are created these object without assign reference variable and add these Dog class to "dogs" list
        dogs.add(new Dog("Jonh","White","Bulldog"));
        dogs.add(new Dog("Tommy","Black","german"));

        /*note So, instead of using a loop to retrieve all the elements from the object , we can use .toString()method by just overriding in the class and we can retrieve all the elements form the objects.
       and  if we pass the argument only in int or double, we can't override toString() . because it's return type is  string.
        this toString we can use only if we are create object in array list*/



        System.out.println(dogs);

        System.out.println("***********************below is the same one with longer way*****************************");
        /*
         Dog dog1 = new Dog("Tomy", "Black", "German");//
        Dog dog2 = new Dog("Jony", "White", "BullDog");
        Dog dog3 = new Dog("Kimi", "Brown", "German");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs); //print  all the objects  together.
        System.out.println(dog1);
          System.out.println(dog2);
            System.out.println(dog3);

         */
    }

}
