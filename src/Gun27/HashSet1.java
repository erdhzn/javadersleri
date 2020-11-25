package Gun27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        // Array--> ArrayList-->SET?
        // Colection= Koleksiyonlar 
        // HashSet: kendine gore bir algoritma ile siralyarak sakliyior 
        // LinkedHshSet; kullanicinin ekleme sirasina gore siraliyor
        //TreeSet: her veri girildiginde tum verileri kucukten uyuge olacak sekilde siraloyor 
        // avantaji: ayni elemani 2 kes eklemiyor 

        ArrayList<Integer>list= new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        System.out.println("list = " + list);
        
        //Set<Integer> hs=new HashSet<>();
        HashSet<Integer> hs= new  HashSet<>();
        hs.add(5);
        hs.add(2);                          // DAHA ONCE EKLENENLERI TEKRARA EKLEMEZ YANI HER SAYI 1 KERE
        hs.add(7);
        hs.add(3); // DAHA ONCE EKLENENLERI TEKRARA EKLEMEZ YANI HER SAYI 1 KERE SOUC FALSE
        hs.add(2); // DAHA ONCE EKLENENLERI TEKRARA EKLEMEZ YANI HER SAYI 1 KERE
        boolean eklediMi= hs.add(2);
        System.out.println("eklediMi = " + eklediMi);

        System.out.println("hs = " + hs);
    }
}
