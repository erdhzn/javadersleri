package Gun41.creatingAndFormatting;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class JavaZonedDateTime {

    public static void main(String[] args) {
        //Basska ulke veya bolgelerin saat diliminbe gore zamani alma
        // new Yorkun saat dilimine saati aldim
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zdtLokal=ZonedDateTime.now();


        DateTimeFormatter format1= DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");


        System.out.println("zdtLocal = " + zdtLokal.format(format1));
        System.out.println("zdt = " + zdt.format(format1));
//    Set<String> bolgeler=ZoneId.getAvailableZoneIds();
//
//        for (String s: bolgeler){
//
//            //if ()
//                System.out.println("s = " + s);
//        }
//
//

    }
}
