package ReplitSamples;

public class Replit133 {

        static int count;

public static int countA(String s){

      for(int i=0 ; i<s.length();i++){

          if(s.charAt(i)=='a' || s.charAt(i)=='A')
            {

               count++;

                }

            }

            return count;

}

        //test case below (dont change):
        public static void main(String[] args){
           // Replit133 obj= new Replit133();
           // obj.countA("aaA");
            System.out.println(countA("aaA")); //3
            count=0;
          System.out.println(countA("aaBBdf8k3AAadnklA")); //6
        }
    }

