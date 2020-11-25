package Gun38.nonAccessModifier.staticModifier;

public class Ogrenciler {
    public static void main(String[] args) {

        Ogrenci ogr1= new Ogrenci("Ali", "Yilmaz");
        Ogrenci ogr2= new Ogrenci("Ayse", "Demir");
//        ....
//        ....
//        ....
//        ....
//        ....

        Ogrenci ogr500= new Ogrenci("mehmet","kaya");
        // 500 tane ogrneci olusturun

        ogr1.print();
        ogr2.print();
        ogr500.print();


        // 1. kural=static field a sadece class dan erisilebilir.
        // 2. kural= diger field lara sadece new ile olusturulmus nesnelerden ulasilir
        // 3.Kural= Ancak olusturulmus bir nesnenin metodlarina static degiskene ulasabilir


    }
}
