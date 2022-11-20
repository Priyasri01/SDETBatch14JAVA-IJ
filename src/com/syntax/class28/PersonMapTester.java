package com.syntax.class28;

import java.util.TreeMap;

public class PersonMapTester {
    public static void main(String[] args) {

       PersonMap emp1= new PersonMap("priya","hari",35,120000);
        PersonMap emp2= new PersonMap("ram","ravi",30,180000);
        PersonMap emp3= new PersonMap("ravi", "donal", 76, 185000);

        TreeMap<Integer,PersonMap> personDetails = new TreeMap<Integer,PersonMap>();

         personDetails.put(1918, emp1);
         personDetails.put(1919,emp2);
         personDetails.put(1920,emp3);

        emp2.printDetails();

       var key=personDetails.entrySet();


        for(var item : key){


          //  System.out.println(item.getKey());
            item.getValue().printDetails();





        }




    }
}
