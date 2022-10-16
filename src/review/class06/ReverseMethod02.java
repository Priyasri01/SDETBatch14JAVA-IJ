package review.class06;

public class ReverseMethod02 {
    public static void main(String[] args) {

        String str = "This is sentence i want to reverse";

        char[] arr = str.toCharArray();

        String reverse="";

        for(int i= arr.length-1; i>=0; i--){

            reverse+=arr[i];
        }

        System.out.println(reverse);
    }
}
