package com.review.class05;

//we can't inhertant the final class.
final class Drinks {

    void drink(){

        System.out.println("Drinking method");
    }
//final method can't be overriden
   protected final void enjoy(){

        System.out.println("we enjoy drinking water");
    }

}


/*public class Juice extends Drinks  {
    //we will get compiler error(CE)--->Cannot override the final method.
  /* public void enjoy(){

        System.out.println("we enjoy drinking juice");
    }

}
*/
