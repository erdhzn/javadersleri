package Gun10;

import java.util.Scanner;

public class JavaIf2 {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        // girilen bir sayinin negatif mi pozitif mi oldugunu yazdiriniz
        System.out.print("bir sayi giriniz =");
        int sayi = oku.nextInt();

            if (sayi > 0)
        {
            System.out.println(" Sayi Pozitiftir");
        }
                if (sayi < 0) {
                    System.out.println("Sayi Negatiftir");
                }

                    if (sayi == 0) {
                    System.out.println("Sayi sifirdir");
                    }







    }
}