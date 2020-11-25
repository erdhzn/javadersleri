package Gun51.task1;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul= new Okul("TechnoStudy",100);
        Ogrenci ogr1= new Ogrenci("Erdogan","Lahnstein",okul,UyeTipi.OGRENCI,1000 );
        Ogrenci ogr2= new Ogrenci("Dogan","Koblenz ",okul,UyeTipi.OGRENCI,20000 );

        Calisan cal1= new Calisan( "ayse", "Almanya", okul,UyeTipi.CALISAN,5000);
        Calisan cal2= new Calisan( "Kemal", "Fransa", okul,UyeTipi.CALISAN,6000);


        okul.OgrenciKayit(ogr1);
        okul.OgrenciKayit(ogr2);

        okul.CalisanKayit(cal1);
        okul.CalisanKayit(cal2);

        System.out.println(okul);
        okul.CalisanListele();
        okul.OgrenciListele();
    }
}
