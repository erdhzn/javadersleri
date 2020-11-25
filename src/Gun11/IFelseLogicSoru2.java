package Gun11;

import java.util.Scanner;

public class IFelseLogicSoru2 {

    public static void main(String[] args) {
        // girilen 2 sayiyi kullanicidan aldiktan sonra
        // toplama icin T, cikarma icin C, carpma icin P, bolme icin D harfleriniz alarak
        // istege uyugun olan islmei yaptirip sonucu yazdirunizn

        Scanner oku = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.println("Toplam için T\nÇıkrma için Ç\nÇarpma için P\nBölme için B ye\n basınız.");
        Scanner oku2 = new Scanner(System.in);
        String islem = oku2.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam = " + (sayi1+sayi2));
        else
        if (islem.equalsIgnoreCase("Ç"))
            System.out.println("Çıkarma = " + (sayi1-sayi2));
        else
        if (islem.equalsIgnoreCase("P"))
            System.out.println("Çarpma = " + (sayi1*sayi2));
        else
        if (islem.equalsIgnoreCase("B"))
            System.out.println("Bölme = " + (sayi1/sayi2));

    }
}
