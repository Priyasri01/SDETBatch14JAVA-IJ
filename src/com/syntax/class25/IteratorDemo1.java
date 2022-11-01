package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts= new ArrayList<>();


        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");

        /*line 27 details:An Iterator is an interface, that interface is implemented by all the classes inside the collection FrameWork.
      this is how we have to call Iterator .and we want to put inside the diamond bracket the corresponding data type<corresponding dataType>.
      in beautyProducts list we store "string" elements so inside diamond bracket  on  the iterator<we need to put string in here>

      */

        Iterator<String>iterator=beautyProducts.iterator(); // in here we are copying  all the elements form beautyProduct and storing inside the "iterator" reference variable.

/*
there are three method inside the iterator, they are .hasNext(), next()
 */

        /* System.out.println(iterator.hasNext()); // in hasNext will not move the pointer, it always tells is their any elements available or not.it will keep on returning true, as long as if there is any elements present in the "iterator"  .
        System.out.println(iterator.next()); // in next(), the pointer moves, it gives us the elements and also removes the elements from iterator and move forward.
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.next();
        System.out.println(iterator.next());*/

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        }

    }

