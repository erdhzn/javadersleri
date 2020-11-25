package Gun6;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {

        // kullanicidan cadde , sokak , pk, ve ulke seklinde adres bilgilerini aliniz

        Scanner bilgi=  new Scanner(System.in);
        System.out.print(" cadde ismini giriniz :");
        String cadde= bilgi.nextLine();
        System.out.print(" sokak ismini giriniz :");
        String sokak= bilgi.nextLine();

        Scanner bilgi1=  new Scanner(System.in);
        System.out.print("pk kodunu giriniz :");
        int pk= bilgi1.nextInt();



        System.out.print("ulke giriniz :");
        String ulke=bilgi.nextLine();

        System.out.println(cadde +" "+sokak+" "+" "+pk+" "+ulke);
      //noku,ma isleminden klavyeden sadce girilen bilgi degil enter ve diger gorunmez
      // karakterler de gittginden sonraki gelen okuma istegi gorunmez karakjterle doalbilir.
      // bu sebeple veri girilmis gibi kabul ediyorn . bunu cozmenin yolu ya araya ek bir gereksin
      // okuma komutu eklemek veya tip degistieme yeni bir degiskeni tanimlanacak



    }
}
