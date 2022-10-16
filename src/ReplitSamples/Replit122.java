package ReplitSamples;

public class Replit122 {

 /*   For you to do:

    Declare 3 instance variables to hold:

    name of the country
    capital
    population size
    Create a method to display values of instance variables

    Create 2 Object, assign values to instance variables, execute method display;

    Expected Output:

    The capital of USA is Washington DC and population is 330000000
    The capital of Kazakhstan is Astana and population is 18500000 */

    String country; // note we created instance varibale line 21,22,23 and we assigned the vlaue inside the method and we called this method in main mehtod trough object.
    String capital;
    String size;

    void main(){

        country= "USA";
        capital="Washington DC";
        size="330000000";

        System.out.println("The capital of " + country + " is " + capital + " and population is " + size);

    }

    void main1(){

        country= "Kazakhstan";
        capital="Astana ";
        size="18500000";

        System.out.println("The capital of " + country + " is " + capital + "and population is " + size);

    }
    public static void main(String[]args){

        Replit122 obj = new Replit122();

        obj.main();
        obj.main1();


    }


}
