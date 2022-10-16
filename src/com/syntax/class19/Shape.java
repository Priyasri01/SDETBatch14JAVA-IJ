package com.syntax.class19;

public class Shape {

    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
   double radius;

    Shape(int radius){

            this.radius=radius;
    }


}
class Circle extends Shape{
    double areaOfCircle;

    Circle(int radius){
        super(radius);
    }

    double calculateOfCircle(){

        areaOfCircle=3.14*radius*radius;
       // areaOfCircle=Math.PI*Math.R

        return areaOfCircle;


    }

    public static void main(String[] args) {

        Circle obj = new Circle(4);
        System.out.println("Area of the circle " + obj.calculateOfCircle());
    }
}
