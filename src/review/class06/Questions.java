package review.class06;

import java.sql.SQLOutput;

public class Questions {

    public static void main(String[] args) {
        //how would you reverse a string without using reverse functions

        /*
        1.use StringBuilder and reverse method


         */

        String str="hello";
        String newString="";
        for(int i=str.length()-1; i>=0; i--){

            newString+=str.charAt(i);
        }
        System.out.println(newString);

        String s="Class is almost over";
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();

        System.out.println(sb);



    }
}
