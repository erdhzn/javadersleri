package Gun16;

import java.util.Scanner;

public class JavaContinueStatement {
    public static void main(String[] args) {
        // kullanicidan 5 ade sayi isteyiniz
        // bu sayialrdan 5 ile 10 rasindakiler haric digerlerinin toplamini bulunuz.
        // bu soruyu continue kullanarak cozunuz
        Scanner sc=new Scanner(System.in);
        int toplam=0;


        for (int i=1;i<=5;i++){
            System.out.print("Bir sayı girin: ");
            int sayı=sc.nextInt();
            if (sayı>5 && sayı<10){
                System.out.println("GIRILEN SAYI 5 ILE 10 ARASINDA  ");continue;
            }
            toplam+=sayı;
        }
        System.out.println("toplam = " + toplam);
    }
}
