package com.review.class08;

public class Apple  extends Fruit{
String size;
String taste;
double price;
    Apple(String name, String shape, String color,String size){

        super(name,shape,color);//note we don't have to call all the constructor from parent class. note in parent class we have two constructor in second constructor we have first constructor also , so if we call one which have all the feild then it's enough.
        this.size=size;
    }
    Apple(String name, String shape, String color,String size,double price,String taste){
       this(name,shape,color,size); //note i am using this keyword in here , because i am calling this constructor within the same class.
        this.taste=taste;
        this.price=price;
    }
//overloading- method with same name within same class
    /*
    how to achieve overloading
    1.Change the number of prameter
    2. change the type of prameter
    3.change the squence/order


in overloading -method signature must be different
method signature= name+parameters
     */
    void makeJuice(){

        System.out.println("From" +name+ " we can make "+ taste+ "juice");
    }

    /* this is not overloading-->Signature is same when compare to line 28 .becasue 28 and this line ()/
    *
    * String makeJuice()*/
    void makeJuice(String fruit){


        System.out.println("we can have juice from "+ name);

    }

    public static void main(String[] args) {

        Apple app = new Apple("apple", "circle", "red","big"); //note we  initialize the sting color . but we cant access it check line13.
        //app.color; not visible  since it access modifier is private.

        System.out.println(app.name);
        System.out.println(app.shape);

        System.out.println(Fruit.fresh);
        System.out.println(Apple.fresh);

        app.grow();
        app.haveBenefits();
    }
/*
is this mandatory to call all constructor from parent class? or always one of them is enough?  Depends on what data you need to use
we cannot create a new constructor without calling a constructor from the parent class, when we are inhertance.
 */
}
