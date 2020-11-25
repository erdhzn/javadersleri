package Gun12;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

            Scanner oku = new Scanner(System.in);
            System.out.print("sayi =");
            int sayi= oku.nextInt();

            int sonuc = (sayi > 50) ? 1 : 0;

            System.out.println(sonuc);
        }
    }

