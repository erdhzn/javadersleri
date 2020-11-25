package Gun13;

import java.util.Scanner;

public class switch6 {
    public static void main(String[] args) {
        // girilen bir ay numarasina gore kayin kac gun oldugunu yazdiriniz.
        System.out.println("Bir ay sayı giriniz : ");
        Scanner oku= new Scanner (System.in);
        int sayi=oku.nextInt();


        switch (sayi)
        {
            case 1:
                System.out.println("Ocak ayi : 31 gün");
                break;
            case 2:
                System.out.println("Şubat ayı : 28 gün");
                break;
            case 3:
                System.out.println("Mart Ayı : 31 gün");
                break;
            case 4:
                System.out.println("Nisan ayı : 30 gün");
                break;
            case 5:
                System.out.println("Mayıs ayı : 31 gün");
                break;
            case 6:
                System.out.println("Haziran ayı : 30 gün");
                break;
            case 7:
                System.out.println("Temmuz ayı : 31 gün");
                break;
            case 8:
                System.out.println("Ağustos ayı : 31 gün");
                break;
            case 9:
                System.out.println("Eylül ayı : 30 gün");
                break;
            case 10:
                System.out.println("Ekim ayı : 31 gün");
                break;
            case 11:
                System.out.println("Kasım ayı : 30 gün");
                break;
            default:
                System.out.println("Aralık ayı : 31 gün");
        }
    }
}
