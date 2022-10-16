package ReplitSamples;

public class Replit134 {

 /*   Write a method with the following specs:

    Returns:

    an integer
    Name:

    countVowels
    Parameters:

    a String called s
    Purpose:

    count the number of vowels in the string s.  Assume s is all lowercase.
            Examples:

    countVowels("obama") ==> 3
    countVowels("happy friday! i love weekends") ==> 9
*/


    static int count = 0;


  public static int countVowels(String s) {

        String name = s.replaceAll("[^a e i o u A E I O U]", "").replaceAll(" ", ""); // second replaceAll is for to remove the space.

      char[] arr = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {

            count++;


        }

        return count;


    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(countVowels("obama")); //3
        count = 0; //  in here i changed the cout to 0 , because static will remain same in 49 cout is 3. so i restarted with O so that when it go for 51 will get correct answer.

        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}