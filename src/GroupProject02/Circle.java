package GroupProject02;

public class Circle  implements IShape {

    double radius;
    double areaofCircle;
    double perimeterOfCircle;


    Circle(double radius){

        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        areaofCircle= Math.PI*radius*radius;
        System.out.println("The Area of the Circle" +areaofCircle);
    }

    @Override
    public void caculatePerimeter() {

        perimeterOfCircle=2*Math.PI*radius;
        System.out.println("Perimeter of Circle " +perimeterOfCircle);

    }
}
class Square implements IShape{

  int a;
  int perimeterOfSquare;
  int areaOfSquare;

  Square (int a){

      this.a=a;
  }

    @Override
    public void calculateArea() {

      areaOfSquare= a*a;

      System.out.println("The area of the Square "+areaOfSquare);



    }

    @Override
    public void caculatePerimeter() {

      perimeterOfSquare=4 * (a *a *a *a);
        System.out.println("The Perimeter of the Square are "+perimeterOfSquare);

    }
}


