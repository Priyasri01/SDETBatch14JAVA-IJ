package com.syntax.class28;

import java.util.HashMap;

public class EntryKeyDemo {

    //var name;  -->var doesn't work with instance variable .because java can't figure out the data type as there are no values
    public static void main(String[] args) {

        HashMap<String,Double> items = new HashMap<>();
        items.put("Iphone", 1000.00);
        items.put("Egg",2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard",100.10);
        items.put("Keyword", 100.00);
        items.put("Flower", 1.00);
       /*note when ever we deal with local variable we can use "var" , we don't  have  to provide the data type.
       java automatically will know when we provide the var. line 18 & line 20 provide the same output */

     var entrySet =items.entrySet();/*line 20 and 22 both are same,
   one used with var the other one is directly mentioned data type in line 24.*/


      // Set<Map.Entry<String,Double>> entrySet =items.entrySet();
        System.out.println("Retrieve all the key and value from the map, so we can use either forloop/enhance for loop");
        for(var item:entrySet){

            System.out.println(item.getKey() + " "+item.getValue());


        }
        System.out.println("used iterator belwo not for loop /enhance loop because we are modify the data");

        var iterator =items.entrySet().iterator();//note:so instead of make separate line for store values and iterator.
        // we combined in single line .

             while(iterator.hasNext()){

                  var item =iterator.next();

              var key  =item.getKey();
               Double value  =item.getValue();

               if(key.contains("e")&& value>100){

                   iterator.remove();
               }

             }

        System.out.println(items);

//this is the shortest form of wirting the code with lambda  when compare to the above iterator
/* items.entrySet().removeIf(x->x.getKey().contains("e")&&x.getValue()>10);

            System.out.println(items); */




    }
}
