package com.syntax.class15;

public class TypeVariableDemo2 {


static int topSpeed=200; // note this value can't be changed , because  top speed is only 200
static int noOfTyres=2;
String model;
int year;

  void printTotalDistance(int noOfGallon, int avg){

      double distance =noOfGallon/10;
      System.out.println("your bike can go max " +distance + "  with this much "+ noOfGallon);
  }

    public static void main(String[] args) {

        System.out.println(TypeVariableDemo2.noOfTyres);

        TypeVariableDemo2 obj = new TypeVariableDemo2();
         obj.model="ybr100";
         obj.printTotalDistance(10,2);


    }
}
