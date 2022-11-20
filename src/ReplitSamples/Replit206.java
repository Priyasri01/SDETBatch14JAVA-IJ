package ReplitSamples;

import java.util.*;

public class Replit206 {
    public static void main(String[] args) {
        HashMap<String,String> letter = new HashMap<>();

        letter.put("ONE","AAA");
        letter.put("TWO","BBB");
        letter.put("THREE","CCC");
        letter.put("FOUR","DDD");
        letter.put("FIVE","EEE");


        System.out.println("HashMap Before Remove :");

        Set <Map.Entry<String,String>> allLetter = letter.entrySet();

        Iterator<Map.Entry<String,String>> list= allLetter.iterator();

        while(list.hasNext()){

            Map.Entry<String,String> lisofLetter =list.next();

            System.out.println(lisofLetter.getKey() + " : " + lisofLetter.getValue());


        }
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");

        HashMap<String,String> removeLetter = new HashMap<>();

        removeLetter.putAll(letter);
        removeLetter.remove("ONE");
        removeLetter.remove("FOUR");

        Set<Map.Entry<String,String>> listOfRemove =removeLetter.entrySet();

        for(Map.Entry<String,String> removeItem:listOfRemove){

            System.out.println(removeItem.getKey() + " : " + removeItem.getValue());
        }

    }


}
    

