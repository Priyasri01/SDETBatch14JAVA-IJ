package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {


     Car car=new Car("Geigo","Tesla");
        Pet pet= new Pet("DogInsurance", "Husky");
        Health health= new Health("HelthFirst");

//as we know we can store not only elements , we can also store objects
        ArrayList<Insurance> insuranceArrayList= new ArrayList<>();

        insuranceArrayList.add(car); //in here we added the object "car"
        insuranceArrayList.add(pet); //in here we added the object  "pet"
        insuranceArrayList.add(health);//in here we added the object  "health"

       for(Insurance in:insuranceArrayList){

           in.getQute();
           in.cancelInsurance();
       }
        System.out.println("****************Next for loop**********************");

       for(int i=0; i<insuranceArrayList.size();i++){

           insuranceArrayList.get(i).getQute();
           insuranceArrayList.get(i).cancelInsurance();
       }

        System.out.println("****************Next iterator*********************");

        Iterator<Insurance> iterator= insuranceArrayList.iterator();

        while(iterator.hasNext()){

            Insurance iter= iterator.next();
            iter.getQute();
            iter.cancelInsurance();

            }
        }
    }

