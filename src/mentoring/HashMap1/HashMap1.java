package mentoring.HashMap1;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {


        // TODO HASHmAP MANTIGI

        // KEY              VALUE

        HashMap<String,String> map= new HashMap<>();
        map.put("Amazon",              "246 Euro");
        map.put("Ebay",              "246 Euro");
        map.put("Saturn",              "246 Euro");
        map.put("Amazon2",              "246 Euro");



        HashMap<String,String>map2= new HashMap<>();

        System.out.println("********1.yol*******");

        map2= new HashMap<>(map);
        System.out.println("map2="+map2);

        System.out.println("-------------2.YOL  -----------------------");

        map2.putAll(map2);
        System.out.println("map2="+map2);


    }
}
