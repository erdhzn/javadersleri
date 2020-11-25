package Gun42.DigerIslemler;

import java.time.LocalDate;

public class _3_CompairingDateandTime {

    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);


        boolean after= bugun.isAfter(dun);// bughun dunden sonra mi

        System.out.println("after = " + after);

        boolean before = bugun.isBefore(dun);// bugun dunen once mi
        System.out.println("before = " + before);

        boolean equal= bugun.isEqual(dun);
        System.out.println("equal = " + equal);// bugun dun e esit mi

        boolean leapYear= bugun.isLeapYear(); //artik yil mi
        System.out.println("leapYear = " + leapYear);
        
        int fark= bugun.compareTo(dun.plusYears(-2));// 2 tarih arasimdaki farkin en uyuk parcasi arasindaki farki verirri
        System.out.println("fark = " + fark);

        //        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
//        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
//        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için

    }
}
