package Gun51.task2;

//girilen bir sayinin basamaklarina gore tersini yazdiriniz

import java.util.Scanner;

public class sour1 {
    public static void main(String[] args) {
        System.out.println(" Tersi alinacak bir sayi giriniz :");
        Scanner oku= new Scanner (System.in);
        int sayi = oku.nextInt();
        int tersiSayi=0;


        // 23452 --> 2 ==> 2*10+5
        while (sayi > 0)
        {
            int basamak = sayi%10;
            sayi=sayi/10;
            tersiSayi =  tersiSayi * 10 + basamak;
        }

        //    basamak  sayı     tersiSayı
        // 1-     2     2345       2
        // 2-     5     234        25
        // 3-     4     23         254
        // 4-     3     2          2543
        // 5-     2     0          25432


        System.out.println(tersiSayi);
    }



}

