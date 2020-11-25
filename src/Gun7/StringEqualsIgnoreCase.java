package Gun7;

public class StringEqualsIgnoreCase {

    public static void main(String[] args) {
        
        // 2 string buyuk kucuk karakter ayrimu yapmadan karsilastirir
        // sonuc boolean degiskenidir.
        
        String str= "merhaba";


        System.out.println("esit mi ="+ str.equalsIgnoreCase("mERHABA"));
        System.out.println("esit mi ="+ str.equalsIgnoreCase( "mERHA)"));
        boolean esitMi = str.equalsIgnoreCase("mERhaba");
        
    }
}
