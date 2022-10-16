package review.class06;

import java.sql.SQLOutput;

public class Demo01 {

    public static void main(String[] args) {

        String str= "hello";

        str.toUpperCase();
        System.out.println(str);

        System.out.println("---------------------");

        String str1= str.toUpperCase();
        System.out.println(str1);

        System.out.println("---------length()------------");

        //length() --> gives size , basically it will show number of character in string.

        int size=str.length();
        System.out.println(size);

        System.out.println("---------charAt()------------");
        //charAt()--return the char value at the specified index
        char letter = str.charAt(1);
        System.out.println(letter);

        //how to get last character

        char lastCharacter=str.charAt(str.length()-1);

        System.out.println(lastCharacter);

        System.out.println("---------------------");

        // indexOf - Returns the index within this string of the first occurrence of the specified character.
       int index =str.indexOf(lastCharacter);
       System.out.println(index); //4

        System.out.println(str.indexOf('f')); // -1 , because  we don't have this charter in this string.
        System.out.println(str);

        //isEmpty()--returns true if length is more than 0

        boolean empty= str.isEmpty();
        System.out.println(empty);

    }
}
