package Gun43.JavaException;

import java.util.Scanner;

public class _5_JavaTryCatch {

    public static void main(String[] args) {
        String str = "bugun";
        int a = 5;
        int b = 0;
        int c = 0;


        try {
            System.out.println("1. adim ");
            char ilkHarf = str.charAt(0);// burada hata olustu  str=" oldugunda
            System.out.println("2. adim ");
            c = a / b;
            System.out.println("3. adim ");

        }
        catch (StringIndexOutOfBoundsException ex)// burada ozel hata ismi yazilirsa ; ilgili hata gelirse catch kismi caklisir
                // ilgili hatanin disinda baska hata gelrise bununn icin baska boum olmadigindan program kirilir.
        {
           //ex.printStackTrace();
            System.out.println("4. adim ");
            System.out.println(" Hata: String dizisinin dizisini siniri asildi  disin");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Aritmetik hata olustu ");
        }
        catch ( Exception ex)// hangi hata olursa olsun hata oldugunda Exception catch calisir
        {
            System.out.println(" Genel hata olustu.");
        }
        System.out.println("5. adim");
    }
}
