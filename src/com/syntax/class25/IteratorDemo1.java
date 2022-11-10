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
        // to Iterator loop this is the first step

/*
there are three method inside the iterator, they are .hasNext(), next()
 */

        /* System.out.println(iterator.hasNext()); // in hasNext will not move the pointer, it always tells is their any elements available or not.
        it will keep on returning true, as long as if there is any single elements present in the "iterator" .
         because this  hashNext() will check for single elements
        System.out.println(iterator.next()); // in next(), the pointer moves, it gives us the elements and also removes the elements from iterator and move forward.
        System.out.println(iterator.hasNext());
        iterator.next();
        /note://note we are not supposed to put two next() in iterator process,  we will get run time error if we have elements with odd size().
        in case it's even then we won't get run time error. But always make sure to have single next(). if we have two .next() it will act like for loop we won't get correct out put.
        }
        iterator.next();
        System.out.println(iterator.next());*/

        while (iterator.hasNext()){ //while is best option for this iterator.
           // System.out.println(iterator.next());

            String name= iterator.next();
            System.out.println(name);
        }

        }

    }

