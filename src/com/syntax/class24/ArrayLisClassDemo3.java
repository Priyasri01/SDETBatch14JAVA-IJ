package com.syntax.class24;

import java.util.ArrayList;

public class ArrayLisClassDemo3 {

    public static void main(String[] args) {
//character is class where as char is primitbve
        ArrayList<Character> chars= new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('Z');
        chars.add('G');
        System.out.println(chars);

        ArrayList<Boolean> booleans = new ArrayList<>();

        booleans.add(false);
        booleans.add(true);
        booleans.add(true);
        booleans.add(false);

        ArrayList<Float> flo = new ArrayList<>();
        flo.add(12.5f); // f can be capital or smaller
        flo.add(12f);
        System.out.println(flo);

    }
}
