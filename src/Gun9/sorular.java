package Gun9;

import java.util.Scanner;

public class sorular {

    //sorualr
    //1. girilen bir sayinin 1 ler basamagini ekrana yazdirinniz
    //2. girilen bir sayinin 10 lar basamagini  ekrana yazdirininz
    //3. girilen bir sayinin 100 ler basamagini  ekrana yazdirirniz
    //4. girilen   3 basamakli bir sayinin  basamakalrin  toplamini ekrana yazdiriniz
    //5. girilen 3 basamakli bir sayinin basamakalrina gore tersini  bir sayi olatak ekrana yazdirinizn
    //orn: 435  >> 534
    //6. 2020 yilina kadar gecen gun sayisini bulunuz .
    // kullanicidan vize ve final notunu aliniz  . ortalmayi 0.4*vize +0.6*final olarak bulunuz


    public static void main(String[] args) {
        Scanner oku= new Scanner (System.in);
       /* System.out.println("3 basamankli bir sayi giriniz =");
        int sayi = oku.nextInt();

        //435=534
        int birler =sayi %10; // ilk basamagi verir
        int onlar = (sayi/10)%10 ; //
        int yuzler =sayi /100; // yuzkler basamagini veriee

        System.out.println("yuzler = " + yuzler);
        System.out.println("birler  = " + birler );
        System.out.println("onlar  = " + onlar );

        int tersi = birler*100+onlar*10 + yuzler;

        System.out.println("tersi = " + tersi);*/
        


//2. SORU
  // 2020 YILINA KADARA GECEN GUN SAYISINZI BULUNUZ/
        
        int gecenGunMiktari=(2020*365)+(2020/4);

        System.out.println("gecenGunMiktari = " + gecenGunMiktari);
        
        
        
        
    }
}