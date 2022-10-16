package ReplitSamples;

public class Replit148 {

    /*
    In ShoppingStore class:

Create variables as below.

item,
price,
quantity
Create a constructor to initialize instance variables.

Create a method with name itemTotalPrice.

write a logic to to calculate the total values of items in stock. and print the result.

return the total value.

In Main Class.

Create two Object of ShoppingStore and pass the parameters to Constructor.

then using each object call the method itemTotalPrice.

Store the returned value of each object.

Calculate sum of both object and print the result.

Output:

Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today
     */
}

class
        ShoppingStore {

    static String item;
    double price;
    int quantity;
    static double sum1 = 0;
    static double sum2 = 0;
    static double total = 0;

    ShoppingStore(String item, double price, int quantity) {

        this.item = item;
        this.price = price;
        this.quantity = quantity;


    }

    double itemTotalPrice() {

        sum1 += price * quantity;

        return sum1;
    }

    double itemTotalPrice1() {

        sum2 += price * quantity;

        return sum2;
    }

   public  static void dispalyTotalValue() { //note made public, so it can visible with all the package in the project and made as static so we can call this mehtod  directly with the class name in the replit148tester

        total += sum1 + sum2;

        System.out.println("You purchased " + total + " Today");
    }
}
