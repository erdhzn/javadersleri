package Gun33.Task2;

import java.util.ArrayList;

public class Task2 {
    // bir universitede ogrencilere ders kaydi yapilacak
    // ders sinifi : Lesson, fields:name,, credit(1-3)
    // ogrenci sinifi ayri dosyada adi :Student , name, maxCredit,dersleri liostesinin tutacak bir lsite
    // 3. bolum= LessonCreate adina ders olusturabilecegimiz bir metod ekleyiniz
    // bu metodu direkt kullanmak istiyoruz
    // 4.  1 adet ogrenci taimlayiniz alabilecegi maxCredi si 10 olsun
    // 5.  bu ogrencinin ders listesine acilmis dersleri ekleyiniz
    // .ders eklerken max alabilecegi Credit i gecmemeli,  gecerse uyari versin.
    // alabilecegi max Credit doldu sekilinde olsun

    // odev
    //6 asagidaki ders olustuma kismi icin ilgili sinifta lessonCreate adinda biur metod olusturunuz
    // ogrenciye ders eklme bolumunu yine ilgili sinifta bir metodolrak yaziniz


    public static void main(String[] args) {
       lesson mat101= new lesson();
       mat101.name="Matematik";
       mat101.credit=3;


        lesson java101= new lesson();
        java101.name="Java Programing";
        java101.credit=6;

        lesson fiz101= new lesson();
        fiz101.name="Fizik";
        fiz101.credit=4;

        Student ogrenci1= new Student();
        ogrenci1.name="ERD";
        ogrenci1.maxCredit=10;

        ogrenci1.lessonList= new ArrayList<>();
// buraya kojntrol konacak toplam aldigi krediye bakilarak
        if (ogrenci1.totalCredit()+ mat101.credit<=ogrenci1.maxCredit) {
            ogrenci1.lessonList.add(mat101);
        }
        else
        {
            System.out.println(" mat101 icin Alabilecegiznin kredi miktari doldu");
        }
        if (ogrenci1.totalCredit()+ fiz101.credit<=ogrenci1.maxCredit) {
            ogrenci1.lessonList.add(fiz101);
        }
        else
        {
            System.out.println("fiz102 Alabilecegiznin kredi miktari doldu");
        }
        if (ogrenci1.totalCredit()+ java101.credit<=ogrenci1.maxCredit) {
            ogrenci1.lessonList.add(java101);

        }
        else
        {
            System.out.println("java103 Alabilecegiznin kredi miktari doldu");
        }
    }
}
