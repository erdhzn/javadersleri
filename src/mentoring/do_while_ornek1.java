package mentoring;

import java.util.Scanner;

public class do_while_ornek1 {


    // TODO GIRILEN BIR SAYININ RAKAMLARININ TOPLAMINI YAZINIZ

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("bir sayi giriniz :");

        int  sayi=sc.nextInt();
        int toplam=0;
        do{
            toplam+= sayi%10;
            sayi=sayi/10;
            System.out.println("Basamagin toplami ="+ toplam+ "kalan sayi"+sayi);

        }
        while (sayi>0);
        System.out.println("toplam="+ toplam);
    }
}
