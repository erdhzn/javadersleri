package Gun34.Task.unikayit;

import java.util.ArrayList;

public class Student {
    String name;
    int maxAlabilecegiDersSaatiMiktari;
    ArrayList<Lesson> StudentLessons=new ArrayList<>();


    public static  Student createStudent(String name, int maxAlabilecegiDersSaatiMiktari){

         Student ogrenci= new Student();
         ogrenci.name=name;
         ogrenci.maxAlabilecegiDersSaatiMiktari=maxAlabilecegiDersSaatiMiktari;

         return ogrenci;

    }
    public void LessonAdd(Lesson ders)
    {
        // ogrencinin bu ana kadar alditig ders saatlerin toplami
        int ogrenciToplamDersSaati=0;
        for (Lesson aldigiDers:StudentLessons){

            ogrenciToplamDersSaati+=aldigiDers.hour;
        }
        if (ogrenciToplamDersSaati+ ders.hour<maxAlabilecegiDersSaatiMiktari ){

            StudentLessons.add(ders);

        }
        else {
            System.out.println(name+" "+ders.name+ "Max saatinin astiniz. ders eklenemez");
        }

    }
public void printLesson()
{
    System.out.println(name+" isimli ogrencinin aldigi derler ");
    int aldigiToplamSaat=0;
    for (Lesson ders: StudentLessons)
    {
        System.out.println(ders.name+" "+ders.hour);
        aldigiToplamSaat+=ders.hour;

    }
    System.out.println("aldigiToplamSaat = " + aldigiToplamSaat);
}

}
