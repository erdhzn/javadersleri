package Gun8;

public class StringStartsWith {

    // boolean kullaniliyor

    public static void main(String[] args) {
       // String oku = "Merhaba Dunya";
       // System.out.println("cumle Merhaba ile mi basliyor :" + oku.startsWith("Merhaba"));
        //System.out.println("cumle merhaba ile mi basliyor :" + oku.startsWith("merhaba"));
        //System.out.println("cumle mer ile mi basliyor :" + oku.startsWith("mer"));

// aciklama : bir stringin verilen string ile baslayio baslamadigini kontrol eder

        String text = "Adim Erdogan";
        System.out.println( " Adim ile mi basliyor?: " + text.startsWith("Adim"));
        System.out.println( " di ile mi basliyor?: " + text.startsWith("di"));
        System.out.println( " im ile mi basliyor?: " + text.startsWith("im"));


    }
}
