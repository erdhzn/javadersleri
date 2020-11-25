package mentoring;

import java.util.Scanner;

public class whilemen {


    //TODO INTEGER PIN KODU SORMA

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("PIN KODUNUZU GIRINIZ  :");
        int userPin= sc.nextInt();

        int pinCode=5555;
        while(userPin !=pinCode){

            System.out.println("*********Yanlis Pin********");
            System.out.println("Tekrar Deneyiniz...");
            userPin=sc.nextInt();

        }
        System.out.println("basariyla giris yaptiniz ..");
    }
}
