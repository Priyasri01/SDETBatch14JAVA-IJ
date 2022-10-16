package ReplitSamples;

class Replit148Tester {


    public static void main(String[] args) {

        ShoppingStore obj1 = new ShoppingStore("Blanket", 99.98, 1);

        System.out.println(obj1.item + " Total Value " + obj1.itemTotalPrice());

        ShoppingStore obj2 = new ShoppingStore("Mattress", 219.59, 2);

        System.out.println(obj2.item + " Total Value " + obj2.itemTotalPrice1());


        ShoppingStore .dispalyTotalValue();


    }
}