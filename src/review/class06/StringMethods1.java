package review.class06;

import java.sql.SQLOutput;

public class StringMethods1 {

    public static void main(String[] args) {
        String textFromApplication=" Enroll today ";
        String textFromUserStory="Enroll today";

        if(textFromApplication.trim().equals(textFromUserStory))
        {

            System.out.println("text is matched.test Pass");

        }else{

            System.out.println("text not matched.test Pass");


        }
        System.out.println(textFromApplication.trim()); // result "Enroll today"
        System.out.println(textFromApplication); //result " Enroll today "

        //substring

        String str2= " Hello class";
        String part2= str2.substring(6); // class
        System.out.println(part2);

        String part1= str2.substring(0,5);
        System.out.println(part1);//Hello

        //concat
        String newString=part1.concat(" ").concat(part2);
        System.out.println(newString);

        System.out.println(part1+part2);

        // some example for substring

       char single= newString.substring(6).charAt(0);
        System.out.println(single);

       // newstring.charAt(0).substring(6); // will get compiler error because charAt will return char value so it can't work with substring.

        //replace();

        String myString="Today is September";
      // myString= myString.equalsIgnoreCase("today is september" ).replace("september", "October"); //it will give compiler error , bacause first is string , secod is boolean , thrid is sting.
         System.out.println(myString);


         //split

        String myStr=" Today is a review class";

        String[] array= myStr.split(" ");
        System.out.println(array.length); //5
        System.out.println(array[4]);

        for(int i=0; i<array.length; i++){

            System.out.println(i);
        }
        //other way

        for(String arr: array){

            System.out.println(arr);
        }

        }
    }

