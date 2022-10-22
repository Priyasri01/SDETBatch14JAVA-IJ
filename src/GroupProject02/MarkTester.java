package GroupProject02;

public class MarkTester {

    public static void main(String[] args) {

        Marks[] marks = { new StudentA(80,90,70), new StudentB(90,80,60,70)};

     for(int i=0; i<marks.length;i++){

         System.out.println(marks[i].getPercentage()+"%");
     }

      /*  for(Marks mark :marks){

          System.out.println(marks + "percentage is" +mark.getPercentage());
        } */

    }
}
