package ReviewClass07;

public class Dog {

    String name; //instance variables
    int weight; // instance variables

    static String breed; // static variables is also called class variable

    void printInfo() {

        System.out.println("Dog Features:" + name + " " + weight + ", " + breed);
    }

    void love(String thing){

        System.out.println(name+ "love jump" + thing);

    }
/*create a method to calculate price

if weight is more than 5-->100
if weight is more than 10-->300
if weight is more than 20-->1000
 */

   float getPrice() {

        if (weight < 5) {

            return 100;
        } else if (weight < 10) {

            return 300;
        } else {

            return 1000;
        }
    }

    /* Create a method that will return bark type

    if weight is less than 5--> loud
    if weight is  less 10--> noise is wooh
     if weight is  less 50--> noise is Gav  gav

     */

    String bark() {

        String noise;

        if (weight < 5) {
            noise = "loud";
        } else if (weight < 10) {
            noise = "woof woof";
        } else {
            noise = "GAV GAV";
        }
        return noise;
    }

    /*variable syntax

data type name;
String breed;

method syntax

returntype  name
1)void        printInfo


 */
}