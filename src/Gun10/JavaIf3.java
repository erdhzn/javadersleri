package Gun10;

import java.util.Scanner;

public class JavaIf3 {
    public static void main(String[] args) {
        // girilen iki sayidan buyuk olanini ekrana yazdiriniz , esit ise esit yazdiriniz
Scanner oku=new Scanner (System.in);


        System.out.print("birinci  sayiyi  giriniz =");
        int sayi1=oku.nextInt();

        System.out.print("ikinci sayiyi giriniz =");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2)
            System.out.println("1. sayi buyuktur");
        if (sayi2 >sayi1)
            System.out.println("2. sayi buyuktur");
        if (sayi1==sayi2)
            System.out.println("2 sayida esittir ");

    }
}
