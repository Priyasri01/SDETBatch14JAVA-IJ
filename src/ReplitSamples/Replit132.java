package ReplitSamples;

public class Replit132 {

    /*
    Complete the reduce10 method by making it subtract 10 from every element of the double array nums.

    The method should static and it should return a new 2D array object

    Print values from new array in the format below input

1 2 3 4
4 5 6 7
1 3 5 7
Expected Output:

-9 -8 -7 -6
-6 -5 -4 -3
-9 -7 -5 -3
     */


    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
       reduce10(a);

    }
    //create method reduce10 here
    static int[][] reduce10(int[][] a){
        int[][] b= new int [a.length][a[0].length]; // this actually creating new arr variable int[][]b = new int[row][column] --- this is how we have to  create new variable if we don't know the size.
        for(int i=0; i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[i][j]=a[i][j]-10;

               System.out.print(b[i][j]+ " "); //.print means print on the same line

            }
           System.out.println(); //meaning start the next loop in next line
        }
        return b;
    }
}

