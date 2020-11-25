package Gun22;

import java.util.Scanner;

public class JavaMetod6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println( " 1. sayi =");
        int sayi1= sc.nextInt();

        System.out.println( "2. sayi  =");
        int sayi2=sc.nextInt();
        int sonuc =toplamYaz(sayi1,sayi2);
        System.out.println("sonuc="+sonuc);

        int enb=enBuyuk(sayi1,sayi2);
        System.out.println("enb ="+enb);


    }

    public static int toplamYaz(int s1,int s2)
    {

        int toplam=s2+s2;
        return toplam;
    }

    public static int enBuyuk(int s1,int s2)
    {

        if (s1>s2)
            return s1;
        else
            return s2;
    }
}
