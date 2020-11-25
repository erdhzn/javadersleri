package Gun11;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        // girilen  bir ogrencinjin notunu gore 50 den buyuk ise gectiniz dusuk ise kaldiniz yazdiriniz

        Scanner sc= new Scanner (System.in);

        System.out.print("notu gitiniz  :");

        int ogrNot = sc.nextInt();

        if (ogrNot>=50){
            System.out.println("Gectiniz");
        System.out.println("tebrikler mevzuyu anladiniz ");}

        // yukarıdaki 3 adet ifin yerine aşağıdaki aynı görevi daha hızlı sağlar çünkü tek şart
        // kontrol eder aşağıdaki yapı, yukarıdaki her iki if in şartınız da kontrol eder.
        if (ogrNot<50)
            System.out.println("Kaldiniz");

        if (ogrNot>=50)
            System.out.println("Gectiniz");
        else
            System.out.println("Kaldiniz ");

    }
}
