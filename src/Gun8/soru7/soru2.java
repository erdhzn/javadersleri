package Gun8.soru7;

import java.util.Scanner;

public class soru2 {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("lutfen adinizi ve soyadinizi giriniz= ");
        String adSoyad= oku.nextLine();

        int boslukIndex= adSoyad.indexOf(" ");
        String ad = adSoyad.substring(0,boslukIndex);
        String Soyad= adSoyad.substring(boslukIndex+1);

        System.out.println("ad =" + ad);
        System.out.println("Soyad ="+ Soyad);
    }

}
