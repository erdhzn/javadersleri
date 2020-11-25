package Gun11;

import java.util.Scanner;
public class IfElse2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // girilne sayinin pozitif mi negatif mi oldugu u yazininz
        // 3 ihtimal po,ne,sifir

        System.out.print("Sayi giriniz  :");
        int sayi =sc.nextInt();

        if (sayi >0)
            System.out.println("pozitif");
        else // 2 ihtimal daha var
        if (sayi <0)
            System.out.println("negatif");
        else
            System.out.println("sifir");
    }
}
