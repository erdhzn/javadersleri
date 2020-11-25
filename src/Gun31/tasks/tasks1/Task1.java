package Gun31.tasks.tasks1;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        // create class student with fields
        // string name , int not

        // daha sonra 3 tae ogrenci ve notu olusturun ve bu ogrencileri bir Arraylist e ekleyin
         // daha sobra ogrenci bilgileri yazdiran bir metod yazarak Arrayliste teki ogrenci bilgilerini  dongu ile yzdiriniz
        // daha sonra butun ogrncilerin not ortlamasini bir metod araciligi ile bularak mainde yazdiriniz

Student ogr1= new Student();
Student ogr2=new Student();
Student ogr3= new Student();

ogr1.name ="ali";
ogr1.not=70;
ogr2.name="ayse";
ogr2.not=100;
ogr3.name="alex";
ogr3.not=90;

        ArrayList<Student> ogrenciler= new ArrayList<>();
        ogrenciler.add(ogr1);
        ogrenciler.add(ogr2);
        ogrenciler.add(ogr3);


        BilgiYazdir(ogrenciler);
        System.out.println("ortalama=" + ortalamaBul(ogrenciler));
        System.out.printf("ortalama= %6.2f"  , ortalamaBul(ogrenciler));


    }

    public static void BilgiYazdir(ArrayList<Student> ogrenciler)
    {
        for (Student ogr:ogrenciler )
        {
            System.out.println("ogr.name="+ ogr.name+ " Notu="+ ogr.not);
        }

    }
    public static double ortalamaBul(ArrayList<Student> ogrenciler)
    {
        double ort=0;
        int toplam=0;
        for (Student ogr:ogrenciler)
        {
            toplam+=ogr.not;
        }


        ort=toplam/ogrenciler.size();

        return ort;
    }


}
// 1. kismi
class Student {

    public String name;
    String Name;
    int not;
}