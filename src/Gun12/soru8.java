package Gun12;

import java.util.Scanner;
// kullanicidan sayi iste. bu sayiya otomatik 1 ekleme oluyor
// daha sonra tahm,ine basla

public class soru8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.print("sayi :");
        int a=sc.nextInt();

        int uretilenSayi= (int) (Math.random()*a+1);
        System.out.println("sayi tahmininin =");
        int tahmin=sc.nextInt();
        if (uretilenSayi == tahmin)
            System.out.println("tebrikler");
        else
            System.out.println("bilmedin ki bilemedin ki");

        System.out.println("uretilenSayi = " + uretilenSayi);


    }
}
