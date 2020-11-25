package Gun14;

import java.util.Scanner;

public class whihlesoru {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        int num;
        int ctoplam=0,ttoplam=0;

        do{

            System.out.print("Bir Sayı Girin: ");
            num = sc.nextInt();

            if(num%2==0)
                ctoplam+=num;
            else
                ttoplam+=num;

        }while(num != 0);

        System.out.println("Tek Sayı Toplamı : " + ttoplam);
        System.out.println("Çift Sayı Toplamı: " + ctoplam);
    }
}


