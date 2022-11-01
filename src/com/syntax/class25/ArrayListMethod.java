package com.syntax.class25;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<String> makeUpItem= new ArrayList<>();

        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealar");
        makeUpItem.add("Mascara");
        makeUpItem.add("EyeLinear");
        makeUpItem.add("Lipstick");

        ArrayList<String>cosmetics = new ArrayList<>();

        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("lotion");

        ArrayList<String> beautyProducts= new ArrayList<>();
        //adds everything from makeUpItem   and from cosmetics to beautyProducts
        beautyProducts.addAll(makeUpItem); //basically by using this .addAll mehtod it will add all the elements from other list. ex: in beautyProduct we are adding all elements form makeupItem list.
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.remove("lotion");  // removes only one item
        System.out.println(beautyProducts);

        beautyProducts.removeAll(cosmetics); //this method will remove all elements  from the particular list/collections which we mentioned inside the parenthesis().
        System.out.println(beautyProducts);


        beautyProducts.clear(); // removes everything in the beautyProducts
        System.out.println(beautyProducts);





    }


}
