package com.syntax.class20;

public class HomeWork01 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box

Use separate class to test your code
     */
    private int length;
    private int width;
    private int height;
    private int rectangle;
    private int square;
    private int box;
static int a=10;

 HomeWork01(int length,int width){

        this.length=length;
        this.width=width;

    }
    HomeWork01(int length, int width, int height){

        this(length,width);
        this.height=height;
    }

   /* HomeWork01(int a ){

        this.a=a;
    }*/
    void Rect(){

        System.out.println("Area of the Rectagle "+ (width*length));


    }

  static void squ(){

      System.out.println("Area of the Square " + (a*a));
    }


    void box(){

        System.out.println("Area of the box " + (length + width+ height) );
    }

}
