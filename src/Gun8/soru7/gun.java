package Gun8.soru7;

import java.util.Scanner;

public class gun {
    public static void main(String[] args) {
        Scanner oku= new Scanner( System.in);
        System.out.println("adinizi ve soyadinizn giriniz= ");

        String adAd2Soyad=oku.nextLine();
        char adIlkHarf= adAd2Soyad.charAt(0);
        char ad2Ilkharf=adAd2Soyad.charAt(adAd2Soyad.lastIndexOf( " ")+ 1);
        char soyadIlkHarf= adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ")+1);


                // 2. yontem

        int ilkBoslukIndex= adAd2Soyad.indexOf(" ");
        int sonBoslukIndex=adAd2Soyad.lastIndexOf(" ");

        ad2Ilkharf= adAd2Soyad. charAt( ilkBoslukIndex+1);
        soyadIlkHarf= adAd2Soyad.charAt(sonBoslukIndex);


    }
}
