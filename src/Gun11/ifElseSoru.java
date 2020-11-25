package Gun11;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ifElseSoru {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("vize notunuzu giriniz  :");
        double Vizenot=sc.nextDouble();

        System.out.println("Final notunuzu giriniz  :");
        double finalNot= sc.nextDouble();

        double toplamNot=( Vizenot * 40 / 100) +(finalNot*60/100);

        System.out.println("Toplam ders notunuz ="+ toplamNot);

        if (toplamNot>=60)
            System.out.println("Tebrikler gectiniz ");

        else
            System.out.println("kaldiniz ");



    }
}
