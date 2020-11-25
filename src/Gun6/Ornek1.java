package Gun6;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        // kullanicidan adini ve soyadini alarak ekrana yazidirizniz

        Scanner oku = new Scanner(System.in);

        System.out.print("Adinizi ve soyadinizi giriniz=");
        String adSoyad = oku.nextLine();
        System.out.println("adSoyad = " + adSoyad);


        //

        // KULLANICIDAN ADINI VE SOYADINI AYRI AYRI OKUTARAK ALIP
        //  BIRLIKTE EKRAN AYZDIRINIZ

        Scanner sc= new Scanner(System.in);

        System.out.print( "Adiniz :");
        String ad = oku.nextLine();

        System.out.print("Soyadinizn :");

         String soyad = oku.nextLine();

        System.out.println("Adiniz ve  Soyadiniz" + ad + " " + soyad);


    }


}
