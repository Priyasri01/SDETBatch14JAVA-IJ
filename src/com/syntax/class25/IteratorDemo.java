package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

            ArrayList<String> beautyProducts=new ArrayList<>();
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


            //get the iterator from the list


      /*  System.out.println(iterator.hasNext()); //with hasNext the pointer always at -1 doesnt move forward.hasNext only gives false if there are no items left
        System.out.println(iterator.next()); //.next method goes next element.so everytime we use .next we get the value and delete it from the iterator at the same time so that is how to force hasNext's pointer  to move to  the next element
        System.out.println(iterator.hasNext()); */

        Iterator<String> iterator =beautyProducts.iterator();
        while (iterator.hasNext()){
            String item= iterator.next(); //better approach by creating reference varaible for .next() and calling them
            if(item.endsWith("r")){
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);
    }
}
