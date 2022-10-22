package GroupProject02;

public class ShapeTester {

    public static void main(String[] args) {


        IShape[] shape = {new Circle(5), new Square(4)};

        for (IShape sh : shape) {

            sh.calculateArea();
            sh.caculatePerimeter();
            System.out.println("**********************************************");

        }


    }
}
