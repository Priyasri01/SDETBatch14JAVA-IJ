package com.syntax.class22;

public class Animals {

    void eat(){

        System.out.println("Animals usually eat plants");
    }
    void sleep(){

        System.out.println("Animals sleep for 8 to 10 hours");
    }
}
class Panda extends Animals{
/*
@override is an annotation that tells java to check the rules like if we are properly overriding a method or not
 */
    @Override
    void eat(){ // the red arrow next to line 19 tells where we override this method
        System.out.println("Pandas eat Bambooms");
    }
    @Override //it will check and let use know is the override  we done is correct or not.
    void sleep(){



    }
}
class Cat extends Animals{

    void eat(){

        System.out.println("cat will eat fish");
    }
}