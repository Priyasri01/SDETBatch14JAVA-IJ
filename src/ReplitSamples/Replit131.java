package ReplitSamples;

public class Replit131 {

    /*
    Write a method header on line two with the following specs:
Returns:
a String
Name:
thirdLetter
Parameters:
a String called s
Then complete the method by programming the following behavior
Returns every 3rd letter of the String s,
starting from the first letter.
See below examples.
Examples:

thirdLetter("hello there") ==> "hltr"
thirdLetter("technology") ==> "thly"
     */
    String thirdLetter(String s){

          String name="";

            for(int i=0; i<s.length(); i+=3){

                name+=s.charAt(i);

            }

            return name;

        }

        //test case below (dont change):
        public static void main(String[] args){
            Replit131 obj = new Replit131();
          System.out.println(obj.thirdLetter("hello there" )); //"hltr"
           System.out.println(obj.thirdLetter("truepeterjohn").charAt(0)); //note even though it's check the for loop , but it only provide first index of the value, since we asked for chartAt(0);

        }
    }

