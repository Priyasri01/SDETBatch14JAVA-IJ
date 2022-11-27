package Practice;

public class LargestArray {

    public static void main(String[] args) {
        /*
         * From an array of integer elements find the largest number.
         */

        int[] arr= {200,30,50,900,80};

        int largestNum=arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]>largestNum){

                largestNum=arr[i];
            }
        }
        System.out.println(largestNum);
    }
}
