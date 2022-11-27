package ReplitSamples;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Replit209 {
    public static void main(String[] args) {

        /*
    "Items", "Apple"
"Price", 20.00
"Quantity", 10
"Items", "Orange"
"Price", 21.99
"Quantity", 10
     */
            List<Map<String,Object>> dataList=new ArrayList<>();
            Map<String,Object> appleMap=new LinkedHashMap<>();
            appleMap.put("Items","Apple");
            appleMap.put("Price",20.00);
            appleMap.put("Quantity",10.0);

            Map<String,Object> orangeMap=new LinkedHashMap<>();
            orangeMap.put("Items","Orange");
            orangeMap.put("Price",21.99);
            orangeMap.put("Quantity",10.0);

            dataList.add(appleMap); //why is not addAll instead of add?
            dataList.add(orangeMap);
       // System.out.println(dataList);

            double price=0;

            double quantity=0;
            double total=0;

            String fruit1="Apple Price:";
            for(Map<String,Object> listData:dataList){

                for(Map.Entry<String,Object> entry:listData.entrySet()){ //why not just map
                    if(entry.getKey().equals("Price")){
                        //price=Double.parseDouble(entry.getValue().toString());
                        price=(double) entry.getValue();
                    }else if(entry.getKey().equals("Quantity")){
                        quantity=(double)entry.getValue();
                    }

                }
                System.out.println("Items: "+fruit1+" " +price +" "+"Quantity:"+quantity +" SubTotal:"+(price*quantity));
                fruit1="Orange Price:";

                total+=price*quantity;
               // System.out.println("Items:Apple Price:" +price+"SubTotal "+(price*quantity));
            }

            System.out.println("Your purchase total :"+(total));
    }
}
