package ReplitSamples;

public class Replit130 {
    static void mystery(int[] a){

        int isEven=0;
        int isOdd=0;

            for(int i=0 ; i<a.length;i++){

                if(a[i]%2==0){

                     isEven=a[i]/2;

                    System.out.print(isEven + " ");

                }else if(a[i]%2!=0){

                    isOdd=a[i]*10;

                    System.out.print( isOdd+ " ");
                }

            }
        }

        public static void main(String[] args) {
            int[] a = {1,2,3,4,5};
            mystery(a);
            // should print out 10 1 30 2 50


        }
    }

