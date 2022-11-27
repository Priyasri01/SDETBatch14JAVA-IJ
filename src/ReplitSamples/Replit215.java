package ReplitSamples;
public class Replit215 {

    public static boolean isBalanced(String input) {
        boolean value = false;
      int count = 0;
        char[] arr = input.toCharArray();

        for(int i =0; i< arr.length;i++){

            count++;

            if(count%2==0){

                value=true;

            }else if(count%2!=0){

                value=false;
            }

        }
        return value;
    }




    public static void main(String[] args) {


        System.out.println(isBalanced("(())))"));


    }



    }


