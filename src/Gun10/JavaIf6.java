package Gun10;

import java.util.Scanner;

public class JavaIf6 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);

        // girilen 3 sayidan en buyuk olanini  bulunuz

        System.out.print("birinci sayiyi giriniz  :");

        int sayi =oku.nextInt();

        System.out.print("ikini sayiyi giriniz :");
        int sayi2= oku.nextInt();

        System.out.print("ucuncu sayiyi giriniz =");
        int sayi3= oku.nextInt();

        int enBuyuk=sayi;
        if (sayi2>enBuyuk)
            enBuyuk = sayi2;

        if (sayi3> enBuyuk)
        enBuyuk=sayi3;
        System.out.println("enBuyuk = " + enBuyuk);
    }
}
