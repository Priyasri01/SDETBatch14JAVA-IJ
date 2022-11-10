package ReplitSamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Replit194 {
    /*
    Create a method that takes a list as a paramter removes an element if it starts with letter A from given List and return new List then in the main method print that list.

 **Expected Output:**

```
[USA, Kazakhstan, Pakistan, Russia]
```
     */
List country(List countries) {

        Iterator<String> iterator = countries.iterator();

        while (iterator.hasNext()) {

            String country = iterator.next();

            if (country.startsWith("A")) {

                iterator.remove();
            }
        }

        return countries;

    }


    public static void main(String[] args) {


        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        Replit194 rep = new Replit194();
        System.out.println(rep.country(countries));




    }
}
