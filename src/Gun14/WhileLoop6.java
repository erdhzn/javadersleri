package Gun14;

import java.util.Scanner;

public class WhileLoop6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        // girilen bir saiyia kadar olan sayilardab sadece tek olnalari ekrena yazdiriniz.
        System.out.println("bir sayi giriniz :");

       int sayi = sc.nextInt();


        while ( sayi > 0 ) {
            if (sayi % 2 == 0)
                System.out.println( sayi );

            sayi--;
        }

    }
}
