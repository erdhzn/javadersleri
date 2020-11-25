package Gun7;

import java.util.Scanner;

public class gununsorusu2 {
    public static void main(String[] args) {

        System.out.println("adininz ve soyadiniz=");
        Scanner oku= new Scanner(System.in);
        String adSoyad =oku.nextLine();

        System.out.println("adSoyad = " + adSoyad);

        char ilkharf= adSoyad.charAt(0);
        System.out.println(ilkharf + "." + adSoyad.charAt((adSoyad.indexOf("  ")+1 ) )+". ");

      

    }

    // 2 kelimelik  ad ve soyadi , ekrana ilk harflerin ve nokta seklinde yazdiriniz
    // ornek : Ahmet Yilmaz----.> A.Y
}
