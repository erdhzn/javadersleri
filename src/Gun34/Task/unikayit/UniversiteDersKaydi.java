package Gun34.Task.unikayit;

public class UniversiteDersKaydi {

    public static void main(String[] args) {
        // universite ogrencilere ders kaydi yapilacak
        // once ders tanimlamalari yapilacak, sonra ogrencilerin kredi alama hakkina gore bu dersler
        // ogrencilere eklenecek

        // 1- Adim:   yeninders olusturmak icin Lesson adin da bir sinif tanimlayininz  fields ; name, hour
        // 2- adim; 3 adet ders  olusutrma metodunu yazininz createLesson

        // metod static oldugubdan nesne tanimlanmasina gerek yok
        // direkt cagrilabilioyor .
        //asagidaki gibi
        // 4. adim Strudent isminde yeni bir calss tanimlayiniz
        // name, maxAlabilecegiDersSaatiMiktari
        //5- ogrenci olusturmayi bir metod ile yazini z
    // 6 adim= 2  adet ogrenci olusturun
        // adi  mehmet ,max= 20 olsun
        // ayse max=12
    // 7. adim = ogrenciye ders eklmek icin Student sinifina bir ders lsitesi tutacak bir
        //  fileds ekleyiniz = StudentLesson adina
    // 8. adim= ogrenciye ders ekleyen LessonAdd isimli bir metod tazininz fakat ders eklenirken
    // toplam ders miktari ogrencinin alabilecegi saat miktarinin asmasin, asarsa uayari yazsin
        //9 . adim = her ogrencnin aldigi dersleri yazanbir metod yazininz ve derslei yazdirinizn
        // printLesson

 Lesson mat101= Lesson.createLesson("mat", 6);
 Lesson fiz101= Lesson.createLesson("fiz",4);
 Lesson java101=Lesson.createLesson("java", 6);

 Student Mehmet=Student.createStudent("Mehmet", 20);
 Student Ayse=Student.createStudent("Ayşe", 12);

    Mehmet.LessonAdd(mat101);
    Mehmet.LessonAdd(fiz101);
    Mehmet.LessonAdd(java101);

    Ayse.LessonAdd(mat101);
    Ayse.LessonAdd(fiz101);
    Ayse.LessonAdd(java101);

    Mehmet.printLesson();
    Ayse.printLesson();
    }
}
