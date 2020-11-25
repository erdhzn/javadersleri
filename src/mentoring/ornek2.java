package mentoring;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);

        //rakamla bir sayi yazdir int olsun
        // string olna bir sayi yazdir
        // sonra yazdirdigin sayilarin toplam degerlerini int olarak bul
        System.out.print("rakamla bir sayi giriniz :");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.print("yazi ile bir sayi giriniz :");
        String num2= scan.nextLine();
        //System.out.println(num1+num2);
         int num3=Integer.parseInt(num2);
        System.out.println(num1+num3);

    }
}
