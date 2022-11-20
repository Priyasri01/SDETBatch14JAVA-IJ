package com.syntax.class29;


import java.util.HashMap;
import java.util.Map;

public class InterviewQ {

    public static void main(String[] args) {

        //Create a method that returns a map of chracters and their count in a string

        String str= "bdfjhdfbewqbcnsdfsdf";

        System.out.println(getCount(str));
    }

    public static Map<Character,Integer> getCount(String str){

        char [] charArr = str.toCharArray();

        Map<Character,Integer> map= new HashMap<>(); //in here creating map which will hold character and their count

        // we are doing loop here because we have take all the letter  one by one and count each character and store inside the map as per the requirements
        for(char c:charArr){ //c is variable name, which holds the character one by one at each iterate.
 //in first iteration the map size will be 0 , because we created empty map in  line 20  in which we going to store the key and value based on if else condtion.
            //this get(c) method will return key value, since we passed the key inside the method. note: if we don't assign value for the object of the class then java will provide the defult value which is null
            if(map.get(c)==null) { //checking the map is there any chracter avilable inside the map, the defult value for the map is null
                map.put(c, 1); //if it's null , then will put the character  inside the map and add 1

            }else{

                int count=map.get(c); //Step:1 if the character already available then will take the pervious count store it in a variable
                count=count+1; //Step:2 then increment that count by 1
                map.put(c,count); //Step:3 and put it back to map with update count.
            }


        }
        return map;
    }
}
