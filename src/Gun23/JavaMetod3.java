package Gun23;

public class JavaMetod3 {
    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = 6;
        int sayi3 = 78;
        // parametre sayisindan ve tipi farkli oldugu durumlard ayni metod adi kullnilir

        int sonuc = toplam(sayi1, sayi2);
        int sonuc1 = toplam(sayi1, sayi2, sayi3);

        double dSayi1 = 5.2;
        double dSayi2 = 6.4;

        double sonuc3 = toplam(dSayi1, dSayi2);

        /****************************************/
        // parametrelerin toipi sirasi farkli oldugundan da ayni isim kiullanilabil
        //KullaniciBilgiYaz("Ahmet",34);
        //KullaniciBilgiYaz(34, "Ahmet");


    }

    public static void KullaniciBilgiYaz(int yas, String ad)
    {
        System.out.println(ad+" "+yas);
    }

    public static void KullaniciBilgiYaz(String ad, int yas)
    {
        System.out.println(ad+" "+yas);
    }


    public static double toplam(double a, double b)
    {
        return a+b;
    }

    public static int toplam(int a, int b)
    {
        return a+b;
    }

    public static int toplam(int a, int b, int c)
    {
        return a+b+c;
    }

}

