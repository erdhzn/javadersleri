package mentoring.If_Else;

import java.util.Scanner;

public class IfElse2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        /*
        ÇİFT - TEK SAYI BULMA
        Sistem bize "Bir sayı giriniz" diye sorsun.
       İnt değerinde bir sayı giriniz.
      Eğer sayı çiftse      "Çift Sayı..   Kalan ->> 0'dır.
      Eğer sayı tekse       "Tek Sayı.. Kalan ->>1'dir.
         */

        System.out.print(" bir sayi giriniz");
        int num =sc.nextInt();
        if (num%2==0){
            System.out.println("Cift sayi "+ " Kalan:->>"+ (num%2));
        }
        else
            System.out.println("Tek Sayi.."+ "Kalan->> "+ (num%2));
    }
}
