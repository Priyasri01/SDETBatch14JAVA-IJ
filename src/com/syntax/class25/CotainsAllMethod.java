package com.syntax.class25;

import java.util.ArrayList;

public class CotainsAllMethod {
    public static void main(String[] args) {

        ArrayList<String> bea= new ArrayList<>();

        bea.add("Blush");
        bea.add("Base");
        bea.add("Concealar");
        bea.add("Mascara");
        bea.add("EyeLinear");
        bea.add("Lipstick");
        bea.add("Dove Soap");
        bea.add("Conditioner");
        bea.add("Shampoo");
        bea.add("lotion");

         /*   System.out.println(bea.contains("lipstick")); //provided the elements
        System.out.println(bea.contains(3)); //povided the index number
        System.out.println(bea.contains("eyeLinear")); */

        //we can use containALL , removeAll  and AddAll only if we're having the list which are created by somebody and we just calling the method with the list/collection reference name.

        ArrayList<String>cosmetics = new ArrayList<>();

        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("lotion");

        System.out.println(bea.containsAll(cosmetics));// this method is checking is bea list contains everything whatever we have in cosmetics or not.

    }
}
