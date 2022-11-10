package com.syntax.class25;

import java.util.ArrayList;

public class RemoveAllMethod {
    public static void main(String[] args) {

        ArrayList<String> makeUpItem= new ArrayList<>();

        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealar");
        makeUpItem.add("Mascara");
        makeUpItem.add("EyeLinear");
        makeUpItem.add("Lipstick");

        ArrayList<String>itemsToBeRemoved = new ArrayList<>(); // note this one is somebody created in other class and your are calling this list "itemToBeRemoved" in line 24.

        itemsToBeRemoved.add("Blush");
        itemsToBeRemoved.add("Base");
        itemsToBeRemoved.add("Concealar");
        itemsToBeRemoved.add("josh");

        makeUpItem.removeAll(itemsToBeRemoved); //it will remove all the item which are present inside itemsToBeRemoved colletion  form the  makeUpItem list/collection

      //  makeUpItem.clear(); // it will removes everything.
        System.out.println(makeUpItem);//[Mascara, EyeLinear, Lipstick]
        System.out.println(itemsToBeRemoved); //[Blush, Base, Concealar, josh]




    }
}
