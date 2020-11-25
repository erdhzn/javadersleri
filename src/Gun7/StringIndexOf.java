package Gun7;

public class StringIndexOf {

    public static void main(String[] args) {
        // verilen karakterlerin  stringin izerisindeki baslangic Index ini verir.

        String text= "Good";
        System.out.println("G harfinin indexi = "+ text.indexOf("G"));
        System.out.println("d harfinin indexi = "+ text.indexOf('d'));
        System.out.println("H harfinin indexi = "+ text.indexOf("H"));

    }
}
