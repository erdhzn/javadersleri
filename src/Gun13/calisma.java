package Gun13;

import java.util.Scanner;

public class calisma {
    public static void main(String[] args) {
        Scanner gun = new Scanner(System.in);
        System.out.println("gun say   :");
        int sayi =gun.nextInt();
        int day = (sayi/7)%10;

        switch (day)
        {
            case 1:
                System.out.println("Pazartesi");
                break;

            case 2:
                System.out.println("Sali");
                break;

            case 3:
                System.out.println("Carsamba");
            break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
              break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");

        }
    }
}