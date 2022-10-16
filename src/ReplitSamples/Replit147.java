package ReplitSamples;

public class Replit147 {
    /*
    In carObject class:

Create instance variables as below.

model
price,
quantity
Create a constructor that will initialize instance variables.

Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.

run the application in Main Class

Expected Output:

Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0
Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
     */
}
class CarObjects{

    String model;
    double price;
    int quantity;
    double totalValue=0.0;


    CarObjects(String model, double price, int quantity){

        this.model=model;
        this.price=price;
        this.quantity=quantity;


    }

    void carStockValue(){

        totalValue+=price * quantity;

        System.out.println(model+" "+"Stock Value " + totalValue);
    }
}