package com.syntax.class27;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<String,String> data = new HashMap<>();
                //key,value
        data.put("UserName","Anthon123"); //This is how we store info inside a map
        data.put("password","pass123"); //in here put method is used to add items to the HashMap
//note:we can say that the key is the varibale name and the value is the value of that varibale
        System.out.println(data);
        System.out.println(data.get("Password")); //pass the key index u get the output


    }
}
