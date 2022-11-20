package ReplitSamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit207 {
    public static void main(String[] args) {
        /*
        Create Hash Map.

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Using EntrySet print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Using EntrySet print the key and values pairs using iterator only

OUTPUT

HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
         */

        HashMap<String,String> map=new HashMap<>();
        map.put("ONE","AAA");

        map.put("TWO","BBB");

        map.put("THREE","CCC");

        map.put("FOUR","DDD");

        map.put("FIVE","EEE");

        System.out.println("HashMap Before Replace :");

        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();

        while(iterator.hasNext())
        {
          Map.Entry<String,String> item=iterator.next();
            System.out.println(item.getKey()+" : "+item.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
        map.put("THREE","ASEL");
        map.put("FIVE","SUMAIR");
       // String name1=map.replace("THREE","ASEL"); //both will work(put & replace method) this replaces() we have one more extra step like storing in the variable
       // String name2 =map.replace("FIVE","SUMAIR");
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();

        while(iterator1.hasNext())
        {
          Map.Entry<String,String> item=iterator1.next();
            System.out.println(item.getKey()+" : "+item.getValue());
        }




    }
}



