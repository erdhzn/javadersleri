package Gun19;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        // kullanicidan alacaginiuz 5 adet sayiyi giris sirasina gore tersten yazir
        int[] dizi=new int[5];
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        for(int i=0; i<dizi.length;i++)
        {
            System.out.print(" Sayilari giriniz =");
            dizi[i]= scan.nextInt();

        }for(int i=dizi.length-1; i>0;i--){
            System.out.println(dizi[i]);
        }
    }
}