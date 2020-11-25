package Gun16;

import java.util.Scanner;

public class JavaForLoop3 {
    public static void main(String[] args) {

        // kullanicinin girecegi bir rakami kadar olan sayilarin toplamini bulunuz
        Scanner sc=new Scanner(System.in);
        System.out.println("sayı girin: ");
        int sayı=sc.nextInt();
        int toplam=0;
        for (int i=0;i<sayı;i++){
            toplam+=i;
        } System.out.println("toplam = " + toplam);
    }

}