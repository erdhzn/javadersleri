package Gun41.creatingAndFormatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaLokalDateTıme {


        public static void main(String[] args) {
            // TARIH VE SAAT BILGISINI TUTAR

            LocalDateTime dt= LocalDateTime.now();

            LocalDate d= LocalDate.of(2020,1,23);
            LocalTime t= LocalTime.of(21, 03, 12);
            LocalDateTime dt1 = LocalDateTime.of(d,t);

            LocalDateTime dt2 = LocalDateTime.of(2021, 01,01,0,0);

            System.out.println("dt.getYear() = " + dt.getYear());
            System.out.println("dt.getMonth() = " + dt.getMonth());
            System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
            System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
            System.out.println("dt.getHour() = " + dt.getHour());
            System.out.println("dt.getMinute() = " + dt.getMinute());

        }
    }

