package Gun14;

import java.util.Scanner;

public class enbuyuksayibulma {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int enb=0;
        int sayac =1;
        while (sayac <=5) {
            System.out.print(sayac+" . Sayi giriniz =");
            int sayi =sc.nextInt();
            if (sayi>enb)
                enb=sayi;
            sayac++;
            System.out.println("enb = " + enb);

        }
    }
}

