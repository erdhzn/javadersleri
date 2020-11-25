package Gun43.StringBulilderStringBuffer;

import java.util.Arrays;

public class _1_JavaString {

    public static void main(String[] args) {
        String cumle="";
        cumle += "Bugün";
        cumle += " hava"; // String değişkeni çok fazla ekleme veya işlemlere göre perfomansı oldukça düşük.

        // Eğer çok fazla String işlemleri yapacaksak bunun için performansı oldukça iyi olanStringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.Fakat paralel çalışan uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.


        // String, StringBuldier, StringBuffer




        StringBuilder s= new StringBuilder("Bu");

        s.append("gun "); // add gibi tekrar atamaua gerek yok
        s.append(" hava");
        s.append(" cok sicak");

        System.out.println("s = " + s);
        System.out.println("s.length() = " + s.length());
        s.append(4);// ne eklenirse eklensin hepsinin stringe ceviriyort 
        
        s.reverse();// String tersine ceviriyor 
        System.out.println("s = " + s);

        s.delete(0,5); // 0 dahil 5 haric 5 e kadar olaan bolumu sildi 
        System.out.println("s = " + s);
        
        s.deleteCharAt(3);
        System.out.println("s = " + s);
        System.out.println("s.length() = " + s.length()); //degiskenkin  icindeki karakter sayisi
        System.out.println("s.capacity() = " + s.capacity());// hafizafda genisleyebiilmesi icin
        // verilmis on alan, sncsk eklenmedikce artan bir alaan ,tampon genisleyebilme alanai
        
        s.insert(5,"545"); // insert yazinca araya yazdigin kelimeyi- sayiyi// yerlestiryor
        System.out.println("s = " + s);
        s. insert(4,3.14);
        System.out.println("s = " + s);

        int []dizi={2,3,4,5,678};
        s.insert(6, Arrays.toString(dizi));
        System.out.println("s = " + s);


        s= new StringBuilder("Bugunhavacoksicak ");
        System.out.println("s = " + s);
        s.replace(2,16,"-bu-");// baslangis  son verilen bolume veroilen stringi atar, eger verilen buyuk ise aradaki
        // bolum delete olur. ust sinir haric
        System.out.println("s = " + s);
        
    }
}
