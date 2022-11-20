package ReplitSamples;

import java.util.HashMap;

public class Replit201 {
    public static void main(String[] args) {

        HashMap<String,String> address= new HashMap<>();

        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");

        System.out.println(address.size());
       address.clear();
        System.out.println(address.size());
    }

}



