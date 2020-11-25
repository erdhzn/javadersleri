package Gun31.Example.ex1;

import java.util.ArrayList;

// ayri bir osyad bir student clasi tanimlayininz ,fields :name , grade

// ayri bir dosyada School classi tanimlayiniz , fields : name, adress, fee,
public class Ex1 {
    public static void main(String[] args) {

   student ogrenci1= new student();
   ogrenci1.name="Ayse";
   ogrenci1.grade=4;
   //

        // 1. Yontem
        School okulu= new School();
        okulu.adress="Goethe Str.";
        okulu.name= "LahnEggs";
        okulu.principalName="Alex";
        okulu.toutionFee=0;

        //2. Yontem
        ogrenci1.schoolInfo= new School();
        ogrenci1.schoolInfo.adress=" Goethe str.";
        ogrenci1.schoolInfo.name="LahnEggs";
        ogrenci1.schoolInfo.principalName="Alex";
        ogrenci1.schoolInfo.toutionFee=0;

        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.name = " + ogrenci1.grade);




    }


}
