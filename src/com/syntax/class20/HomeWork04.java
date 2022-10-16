package com.syntax.class20;

public class HomeWork04 {

    /*
 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
     */

    String MobileName;
    String model;
    String color;

    static void phoneDetails(String MobileName) {


        System.out.println(MobileName);


    }

    private void phoneDetails(String MobileName, String model) {


        System.out.println(MobileName + " and model number is  " + model);
    }

    private void phoneDetails(String MobileName, String model, String color) {

        System.out.println("My favrote Phone is  " + MobileName + " and i have " + color + "and the model number is  " + model);
    }



    public static void main(String[] args)  {


        HomeWork04 obj=new HomeWork04();

        obj.phoneDetails("IPhone");
        obj.phoneDetails("IPhone", "A234");
        obj.phoneDetails("IPhone","A234","Purple");
    }
}



