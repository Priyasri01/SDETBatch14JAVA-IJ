package com.syntax.class22;

public class FinalDemo {
    public static void main(String[] args) {

        Phone phone= new Phone();
    }

}
//the  final class  will be accessible but not extendable
class Phone{ //we can put final which values stays same all the time
    //constructor don't allow any non-access modifier.
    final int RAM= 12; // when we used final keyword , we can't  change the value
//RAM=30; -->This will give error, once we assinged variable as final  then we can't change the value.

    void takePics(){
final int number=10; //we can have final keyword with local varibale

    }
}
class Iphone extends Phone{


}