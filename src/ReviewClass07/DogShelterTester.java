package ReviewClass07;

public class DogShelterTester {

    public static void main(String[] args) {

        Dog.breed="Husky";
        Dog dog1 = new Dog();

        dog1.name="Bobby"; // they can access through the Object name
        dog1.weight=5;
        dog1.printInfo();

        Dog dog2 = new Dog();
        dog2.name="Tommy";
        dog1.weight=10;
        System.out.println(dog2.name);
        dog1.printInfo();
        System.out.println("Making chaning");
        dog1.name="Bobik";
        dog1.breed="German";  /* note we won't get any compiler error, but it will affect
                              other object value also. so if it's static don't change the value because will use
                              the value across the object and package.*/

        String str= "hello";
        int size = str.length();
        System.out.println(size);
        double price =dog1.getPrice(); //we are doing implicit/widening casting //since getprice method is return method , so we are storing inside price
        System.out.println(price);
       float price1= dog2.getPrice();
        System.out.println(price1);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

       //the getPrice method return type is float , but on line 28 we did double
//double --> float = explicit/narrowing //narrowing means from large to smaller --> manual
//float --> double = implicit/ widening //widening means from smaller to larger-->

        dog1.love(" to jump");
        dog2.love(" to play");
    }
}
