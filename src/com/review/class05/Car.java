package com.review.class05;

interface Drivable{

    //by default all variable public static final

    boolean DRIVES=true;

    //we cannot have a constructor

    // by default all methods are public abstract
    void breaks();


}
interface Vehicle{

    void haveMotor();
    //from java 8 we can have static and default method.
    default void haveBreak(){

        System.out.println("All vehicle have break");
    }
    static void honk(){

        System.out.println("all vehicle honk");
    }
}
//with help of abstract class we can achieve 0 to 100% abstraction
public abstract class Car  {

    String color , make ,model;

    public static final int WHEELS=4;

    public Car(String make, String model,String color){

        this.make=make;
        this.model=model;
        this.color=color;
    }

    void drive(){

        System.out.println("All cars can drive");
    }

    abstract void start();

    abstract void stop();

}
class Tesla extends Car implements  Drivable,Vehicle{

    Tesla(String make, String model,String color){
        super(make,model,color);
    }

    @Override
   public void start() {

        System.out.println(make + " Starts automatically");

    }

    @Override
   public void stop() {
        System.out.println(make + " Stop when we press the break");
    }

    public void charge(){

        System.out.println(" you need to charge the " +make);
    }

    @Override
    public void breaks() {
        System.out.println(" you need to charge the " +make);
    }

    @Override
    public void haveMotor() {

        System.out.println(make +" have motor");

    }
    void honk(){

    }
}