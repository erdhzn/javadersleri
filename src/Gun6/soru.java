package Gun6;

import java.util.Scanner;

public class soru {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("birinci sayiyi giriniz :");
        int sayi1= scanner. nextInt( );
        System.out.print("ikinci sayiyi giriniz :");
        int sayi2 = scanner.nextInt();

        int toplam = sayi1+sayi2;
        System.out.print("toplam =" + toplam);

        System.out.println(" toplam = " + sayi1 + sayi2 ); // eger sayilari parantese almaz isek bunlari normal bir yazi gibi kabul eder ve ikisini yanyana yazar
        // sayi1+sayi2  34
        System.out.println(" toplam = " + (sayi1 + sayi2) ); // islem yapmasi icin paranteze almamiz gerekiyor
        //(sayi1+sayi2) 7

    }
}
