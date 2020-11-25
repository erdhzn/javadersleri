package Gun10;

import java.util.Scanner;

public class JavaIf1 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("bir sayi giriniz =");
        int sayi = oku.nextInt();
        if (sayi > 10) ;

        // if in icinde yapilacaklar 1 satirdan fazla ise susulu parantez sart
        {
            System.out.println("girilen sayi 10 dan buyuktur");

            //
            System.out.println("yasinizi giriniz");
            int sayi1 = oku.nextInt();
            if (sayi < 10) ;
            System.out.println("yasin kucuk gelemzsin");
        }
        // girilen bir sayinin 10 dan buyuk ise ekrana 10 dan buyuk diyte yazdiriniz.

    }
}