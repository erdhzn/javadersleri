package Gun43.JavaException;

import mentoring.Enum.days.Months;

import java.time.LocalDate;
import java.time.Month;

public class _4_JavaTryCatch {
    public static void main(String[] args) {

        try {// dene , hatanin basladigi yerin uzerine koinur
            LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
            System.out.println(" isleme tamam ");
        }// hatanin bitteigi yerede parantez kapanir
        catch (Exception hata)// hata isimlin degiskende olusan hatalarin bilgisi ataniyor
        {
        // hata olduguinda ne yapilacagi buraya yaziloyor .
          //  System.out.println(" hata oldu");
         //   System.out.println("hata = " + " tarih donusum hatasi" );
            System.out.println("hata.getMessage() = " + hata.getMessage());
            hata.printStackTrace();// hatanin gectigi asamalari yazar

        }
        System.out.println(" Programin sonuna kadar gelindi");
        try{
            // Java Öğren
        }
        catch(Exception hata){
            // anlaşılamadı
            // hızlıca konuları tekrar et
            // zaman az
        }

        // Sonunda inş iyi bir meslek ve kazanç seni bekliyor.


    }
}