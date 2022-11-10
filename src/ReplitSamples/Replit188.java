package ReplitSamples;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit188 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Please enter any number");

       ArrayList<Integer> numbers= new ArrayList<Integer>();

        while(in.hasNextInt()){

            numbers.add(in.nextInt());

        }


        for(int i=0; i<numbers.size();i++){

            System.out.print(numbers.get(i) + " ");
        }
    }
}
