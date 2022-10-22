package GroupProject02;

public abstract class Car {

    /* Create a class Car that would have the following  fields:carPrice and color and method calculateSalePrice()which should be returning a price of the car.

    create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
     in which returned price is calculated as following: if weight>2000 then returned  price  car should  include 10% discount , otherwise 20% discount.

     The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount,
     otherwise 10% discount.


     */

    double carPrice;
    String color;

    Car(double carPrice,String color){

        this.carPrice=carPrice;
        this.color=color;

    }

   abstract double calculateSalePrice();
}
class Truck extends Car{

    double weight;

    Truck(double carPrice,String color,double weight){
        super(carPrice,color);
        this.weight=weight;
    }
    @Override
    double calculateSalePrice(){


        if(weight>2000){
            System.out.print("Your car price is "+ carPrice + " and based on your car weight  your are getting 10% discount from the total price which is ");
            return carPrice-((carPrice/100)*10);
        }else{
            System.out.print("Your car price is "+ carPrice + "and based on your car weight  your are getting 20% discount from the total price which is ");
            return carPrice-((carPrice/100)*20);
        }


    }
}
class Sedan extends Car{

    double length;

    Sedan(double carPrice, String color,double length){
        super(carPrice,color);
        this.length=length;
    }


    @Override
    double calculateSalePrice() {

        if(length>20){
            System.out.print("Your car price is "+ carPrice + "and based on your car length  your are getting 5% discount from the total price which is ");

            return carPrice-((carPrice/100)*5);
        }
        System.out.print("Your car price is "+ carPrice + "and based on your car length  your are getting 10% discount from the total price which is ");

        return carPrice-((carPrice/100)*10);
    }
}

