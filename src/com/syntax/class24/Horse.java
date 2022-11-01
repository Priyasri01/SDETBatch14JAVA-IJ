package com.syntax.class24;

public class Horse {

    private String name;
    private  String color;
    private double sleep;
    private  String lifeSpan;
    private  int length;

    public Horse(String name, String color, double sleep, String lifeSpan, int length) {
       setName(name);
       setColor(color);
       setSleep(sleep);
       setLifeSpan(lifeSpan);
       setLength(length);
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name Filed can't be emtpy , Please try again");
        } else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("color Filed can't be emtpy , Please try again");
        } else {

            this.color = color;
        }
    }

    public void setSleep(double sleep) {
        if (sleep<0) {
            System.out.println("please don't enter negative number , Please try again");
        } else if (sleep>24) {
            System.out.println("please don't enter valid  number between 0-24 , Please try again");
        }else{
            this.sleep = sleep;
        }

    }

    public void setLifeSpan(String lifeSpan) {
        if (lifeSpan.isEmpty()) {
            System.out.println("sleep Filed can't be emtpy , Please try again");
        } else {

            this.lifeSpan = lifeSpan;
        }
    }

    public void setLength(int length) {

        if (length < 0) {
            System.out.println("pelase enter valid number");
        } else if (length > 50) {
            System.out.println("pelase enter valid number, the height of the horse can't not be more than 50");
        } else {
            this.length = length;
        }
    }


    public String getColor() {
        return color;
    }

    public double getSleep() {
        return sleep;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public int getLength() {
        return length;
    }

    void printInfo() {
        System.out.println("Name " + name + " color " + color + " lifeSpan " + lifeSpan+ " length " + length);
    }
}
class Test{
    public static void main(String[] args) {

        Horse H1= new Horse("","black",2.9,"25-30",8);

      //  System.out.println(H1.name); We can't call the private variable in other class, will give compilre error.
        System.out.println(H1.getName());
        H1.printInfo();
    }
}
