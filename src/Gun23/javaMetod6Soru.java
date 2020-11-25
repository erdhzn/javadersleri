package Gun23;

import java.util.Scanner;

public class javaMetod6Soru {
    public static void main(String[] args) {
        //Kullanıcı bir öğretmendir.
        // Önce ögrencının adı gırılecek,sonra aldıgı farklı mıktardakı notlar gırılecek
        // Ahmet Demir bu okunduktan sonra
        // 80 56 78 90 okutulacak ve ogrencı adı ve ortalaması yazılacak ekrana
        // Ortalama bulma ıslemını bır fonksıyonda yapınız,fakat sonucu yazdırma ıslemını maınde yaptırınız
        //Her ogrencıye farklı sayıda not gırılebılır
        Scanner sc= new Scanner (System.in);
        System.out.println("ogrncinin  adi soyadi=");
        String  isim=sc.nextLine();

        Scanner sc2= new Scanner (System.in);
        System.out.println("ogrencinin notlri :");
        String strNotlar=sc.nextLine();

        System.out.println("Öğrenci = " + isim);
        System.out.println("Ortalaması = " + ortalamaBul(strNotlar));
    }

    public static double ortalamaBul(String notlar)
    {
        double toplam=0;
        String[] notDizi=notlar.split(" ");

        for(int i=0;i<notDizi.length;i++)
        {
            toplam += Integer.parseInt(notDizi[i]);
        }

        return toplam/notDizi.length;


    }
}
