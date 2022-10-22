package ReplitSamples;

public class Replit169 {
    /*
Create final method avgElements that will average all the elements in an integer array (passed to the method as a parameter) and return the average.

Expected Output:

4.8
     */


 final static double avgElements(int[] a){

  double sum=0.0;

for(int i=0; i<a.length;i++){

     sum+=a[i];
    }
return sum/a.length;


  }
	public static void main(String[] args) {

  int[] a = {2,7,3,8,4};

	System.out.println(avgElements(a)); //should print 4.8
	}
}


