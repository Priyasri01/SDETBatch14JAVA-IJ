package ReplitSamples;

public class Replit145 {

    /*
    Complete the Dog.java class:
Create following class variables.

dogName

dogWeight

static dogBreed=Mutt;

For all methods and variables use proper naming convention.

Create constructor to initialize instance variables

In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.
Expected Output:

Tarzan Mutt 50.0
Lucy Mutt 10.0
     */
}

class Dog {

    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";

    Dog(String dogName, double dogWeight){

        this.dogName=dogName;
        this.dogWeight=dogWeight;


    }

    Dog (double dogWeight, String dogName){ //in here  we changed the prameter order to do the overlodding. otherwise java won't know to which consructor we have to look

        this(dogName,dogWeight); //note when u call the this()method inside the prameter order suppose to same.
    }

    void dogDetails()
    {

        System.out.println(dogName + " "+ dogBreed + " " + dogWeight);
    }

}

class main{

    public static void main(String[] args) {

        Dog obj= new Dog("Tarzan",50.0);
        obj. dogDetails();
        Dog obj1 = new Dog(10.0, "lucy");
        obj1.dogDetails();
    }
}
