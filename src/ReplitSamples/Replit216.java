package ReplitSamples;

public class Replit216 {

        public static int[] arraySumToZero(int n) {

            int sum=0;

            int[] arr = new int[n];
            for (int i = 0; i <arr.length; i++) {
                arr[i] =0;
                sum+=arr[i];
            }

            System.out.println(sum);
            return arr;

        }
        public static void main(String[] args){

            arraySumToZero(5);

           // System.out.println(Arrays.toString(arr));

        }
    }

