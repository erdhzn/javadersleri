package Gun9;

import java.util.Scanner;

public class soru1 {
// girilen 2 kelimelik ad ve soyadlarin ilk harflerinzin
    // hepsini kucuk be daha sonra buyuk halleriniz yazdirirniz

    // Ahmt Yilmaz .....ahmet yilmaz
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);
        System.out.println("Adinizi ve Soyadinizi giriniz ;");
        String tamAd= oku.nextLine();
        
        int boslukIndex = tamAd.indexOf("");
        String ilkHarf= tamAd.substring(0,1).toLowerCase();
        String SoyadIlkHarf= tamAd.substring(boslukIndex+1,boslukIndex+2).toLowerCase();
        
        System.out.println("ilkHarf =" + ilkHarf);
        System.out.println("SoyadIlkHarf = " + SoyadIlkHarf);

        
    }
}
