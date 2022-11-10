package Reviwe08;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

    public static void main(String[] args) {
        // we want to sort and remove duplicate from an Arraylist
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1500000);
        number.add(1200000);
        number.add(1300000);
        number.add(1400000);

        Set<Integer> set= new TreeSet<>(number);


    }
}
