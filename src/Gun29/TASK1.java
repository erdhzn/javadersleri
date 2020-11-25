package Gun29;
// Kullanıcıya
// 1-Ekleme
// 2-Listeleme
// 3-Arama
// 4-Düzeltme
// 5-Çıkış
// Seçeneklerini vererek username ve password ve Logincount dan oluşan bir Map tanımlayınız.
// Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
// Mainde sadece Seçenekler ve metodların çağrılması olsun.

// Bölüm bölüm gidiyoruz önce mainin içini tasarlayınız.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TASK1 {
    public static void ekleme(Map<String, Map<String, String>> users )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Username");
        String username= sc.nextLine();

        System.out.println("Password");
        String password= sc.nextLine();

        System.out.println("user name");
        String userTipi=sc.nextLine();

        Map<String,String> bilgilerMap=new HashMap<>(); //burada bir kartvizi gibi mape atildi
        bilgilerMap.put("password", password);
        bilgilerMap.put("userType", userTipi);

        users.put(username, bilgilerMap);// kullanicinin verdigi isme kartvizit gibi bilgilernatildi

    }
    public static void Listeleme(Map<String, Map<String,String>>  users)
    {
     System.out.println("users= "+ users);
    }
    public static void main(String[] args) {
        // username , password , loginCount
        Map<String,Map<String,Integer>   > userlar= new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int secim=0;
        do{
            System.out.println("**********Menu**********");
            System.out.println("1-Ekleme");
            System.out.println("2-Listeleme");
            System.out.println("3-Arama");
            System.out.println("4-Duzeltme");
            System.out.println("5-Cikis");
            System.out.println("Seciminiz=");
            secim= sc.nextInt();


            switch (secim)
            {
                case 1:
                    Map<String, Map<String, String>> users = null;
                    ekleme(users);
                    break;
                case 2: Listeleme();
                    break;
                case 3:// Arama
                    break;
                case 4:// duzeltme
                    break;

            }



        }while(secim!=5);
    }

    private static void Listeleme() {
    }


}
