package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListClassDemo2 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(35);

        int a = 34;
        number.add(a);
        for(int i=0; i<number.size(); i++){
            System.out.println(number.get(i));
        }
        System.out.println("****************************************************");

        for(Integer num: number){

            System.out.println(num);
        }

    }
}
