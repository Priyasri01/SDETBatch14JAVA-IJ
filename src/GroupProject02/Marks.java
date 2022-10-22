package GroupProject02;

public abstract class Marks {

    /*
    we have to caculate the average of marks obtained in three subjects by student A and by Student B.
     Create class 'Marks' with an abstract method  'getPercentage' that will be returning the average percentage of mark.Provide implementation of abstract method in classes
     A & B. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameter for student B. test your code.
     */

    // to get average percentage:In order to find the percentage of the marks, we divide the total scores with marks obtained in the examination and then multiply the result with 100.
    int sub1;
    int sub2;
    int sub3;

  Marks(int sub1, int sub2,int sub3){

        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;

    }
    abstract double getPercentage();

}

class StudentA extends Marks{
    double averageValue;

    StudentA(int sub1, int sub2,int sub3){
    super(sub1,sub2,sub3);


    }


    @Override
    double getPercentage() {

    averageValue=sub1+sub2+sub3;
    System.out.print("StudentA overAll Average ");
 return (sub1+sub2+sub3)/3;

    }
}
class StudentB extends Marks{

    double avaerageValue1;
    int sub4;

    StudentB(int sub1,int sub2,int sub3, int sub4){
        super(sub1,sub2,sub3);
        this.sub4= sub4;

    }


    @Override
    double getPercentage() {
        avaerageValue1 =sub1+sub2+sub3+sub4;
        System.out.print("StudentB overAll Average ");


     return (sub1+sub2+sub3+sub4)/4;
    }
}

