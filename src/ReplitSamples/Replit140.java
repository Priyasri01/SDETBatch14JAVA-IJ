package ReplitSamples;

public class Replit140 {

  /*  For you to do:

    Create the maxLength method that will accept String array of words and return the word with the largest length.

    Method should visible only within same package!

    Expected Output:

            this is long */



    static String maxLength(String[] arr){
           String largest=arr[0];

            for(int i=0; i<arr.length;i++){

                if(arr[i].length()>largest.length()){

                    largest=arr[i];

                }


            }

            return largest;


        }

        public static void main(String[] args) {
            String[] arr = {"hey","yolo","hi","this is long"};
            System.out.println(maxLength(arr)); //note i assigned static method .so that i can call directly method name for the output.
            //should print "this is long"
        }

    }

