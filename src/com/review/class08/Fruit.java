package com.review.class08;

public class Fruit {

    protected String  name;
    String shape;
    private String color;

    public static boolean fresh;

    public Fruit(String name){

    this.name=name;
}
 Fruit(String name, String shape, String color){

        this(name);
        this.shape=shape;
        this.color=color;
    }



    void grow(){

            System.out.println("All fruits grow fresh "+ fresh);
        }

   protected   void haveBenefits(){

            System.out.println("All fruits good for your health");


        }

        public static void  havePeel(){

        System.out.println("all fruit need to be peels");
        }
}
