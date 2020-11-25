package Gun8;

import java.util.Scanner;

public class gununsorulari {
    public static void main(String[] args) {
        Scanner oku = new Scanner (System.in);

      /*  System.out.println("text giriniz :");
        String text= oku.nextLine();

        System.out.println( " text icinde ne aramak istediginizi yaziniz : ");
        String aranan = oku.nextLine();

        String text2 = text.toUpperCase();
        String aranan2= aranan.toUpperCase();

        boolean varMi = text2.contains(aranan2);
        System.out.println("aranan var/yok : "+ varMi);*/

        /*System.out.println(" bir paralo giriniz :");
        String parola = oku.nextLine();
        String parola2= parola.toUpperCase();
        String gercekParola = "Abc123".toUpperCase();
        boolean dogruMu = gercekParola.equals(parola2);
        System.out.println("Parola Dogru Mu = "+ dogruMu);*/

        System.out.print("Lütfen Adinizi ve Soyadinizi giriniz= ");
        String adAd2Soyad=oku.nextLine();


        String  ilkHarf=adAd2Soyad.substring(0,1);
        int ilkBosluk= adAd2Soyad.indexOf(" ");
        String ilkParca=adAd2Soyad.substring(1,ilkBosluk);
        String ikinciIlkharf=adAd2Soyad.substring(ilkBosluk+1,ilkBosluk+2);
        int ikinciBosluk=adAd2Soyad.lastIndexOf(" ");
        String ikinciParca= adAd2Soyad.substring(ilkBosluk+2,ikinciBosluk);
        String ucuncuIlkHarf= adAd2Soyad.substring(ikinciBosluk+1,ikinciBosluk+2);
        String ucuncuParca=adAd2Soyad.substring(ikinciBosluk+2,adAd2Soyad.length());

        System.out.println(ilkHarf.toLowerCase()+ilkParca+" "+ikinciIlkharf.toLowerCase()+ikinciParca+" "+ucuncuIlkHarf.toLowerCase()+ucuncuParca);
        System.out.println(ilkHarf.toUpperCase()+ilkParca+" "+ikinciIlkharf.toUpperCase()+ikinciParca+" "+ucuncuIlkHarf.toUpperCase()+ucuncuParca);


    }
}
