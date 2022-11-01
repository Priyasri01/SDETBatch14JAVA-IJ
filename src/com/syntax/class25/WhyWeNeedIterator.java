package com.syntax.class25;

import java.util.ArrayList;

public class WhyWeNeedIterator {
    public static void main(String[] args) {


        ArrayList<String> beautyProduct = new ArrayList<>();

        beautyProduct.add("Blush");
        beautyProduct.add("Base");
        beautyProduct.add("Mascara");
        beautyProduct.add("Lipstick");
        beautyProduct.add("Dove Soap");
        beautyProduct.add("Conditioner");
        beautyProduct.add("Primer");
        beautyProduct.add("Shampoo");
        beautyProduct.add("lotion");
        beautyProduct.add("Concealar");
        beautyProduct.add("EyeLinear");


      for(int i=0; i<beautyProduct.size(); i++){

          if(beautyProduct.get(i).endsWith("r")){

              beautyProduct.remove(i);
          }
      }
        System.out.println(beautyProduct);
      /*it's not working fine, it's bug . because we given condition to remove everything that 's ends with "r". but in out we see primer and Eyeliner.
        why? as we know arraylist can adjust his size at rum time.As soon as it's remove item from the arraylist ,
        the ArrayList will adjust it's size at run time, and reduce it's size and because of that we might miss some items.
         so for add or rmoving any elements in the collection framwork, for loop might not provide the correct answer meaning sometime it might  provide correct out and some time it's not. so, to get correct result we have to go for iterator.
        */

        //note: even enhance for loop won't work.we will get run time error. check the below example.

        for(String item:beautyProduct){

            if(item.endsWith("r")){

                beautyProduct.remove(item);
            }


        }
        System.out.println(beautyProduct);
        //in enhace for loop, we won't get any output rather we will run time error says "Exception in thread"--->"ConcurrentModificationException"

        /*very important note: we can use loops(forloop& enhance forLoop) in collection framwork  if we want to retrieve elements
         and if we want to add or remove any elements then go for iterator. but better for  collection framework always use iterator.
         */

    }
}
