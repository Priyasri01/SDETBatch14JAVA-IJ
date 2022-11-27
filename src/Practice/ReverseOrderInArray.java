package Practice;

public class ReverseOrderInArray {
    public static void main(String[] args) {

        /*
         * Create an array to store char values and then print those in reverse order
         */

        char[] arr={'a','b','c','d','e'};

        for(int i=arr.length-1; i>=0;i--){

            System.out.print(arr[i] + " ");
        }
    }
}
