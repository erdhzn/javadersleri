package Gun8.soru7;

import java.util.Scanner;

public class SORU3 {

    public static void main(String[] args) {
        Scanner oku= new Scanner (System.in);

        System.out.print("adinizi ve soyadinizi giriniz (3 kelimelik) =");
        String adAd2Soyad= oku.nextLine();
        
        int ilkBoslukIndex = adAd2Soyad.indexOf(" ");
        int sonBoslukIndex = adAd2Soyad.lastIndexOf("");
        
        String ad= adAd2Soyad.substring(0, ilkBoslukIndex);
        String ad2=adAd2Soyad.substring(ilkBoslukIndex+1, sonBoslukIndex);
        String soyad= adAd2Soyad.substring(sonBoslukIndex-1);

        System.out.println("ad = " + ad);
        System.out.println("ad2 = " + ad2);
        System.out.println("soyad = " + soyad);
    
    
    
    
    }
}
