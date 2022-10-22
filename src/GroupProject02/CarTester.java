package GroupProject02;

public class CarTester {
    public static void main(String[] args) {

        Car[] car = { new Truck(35950.00,"Blue",11045),new Sedan(23903.00,"Black",25)};

        for(Car ca :car){

           System.out.println(ca.calculateSalePrice() +" congratulation !");
        }



    }
}
