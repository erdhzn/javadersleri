package mentoring.TRYCATCH;

import javax.imageio.stream.ImageInputStream;

public class rondamSayi {

    static void randomSayi () throws Exception {



    /*
        randomSayi isminde static void bir method oluşturun.

        Bu method içerisinde iki int random sayı oluştusun. (0'dan 10 a kadar)

        Bu iki random sayının toplamını yazdırın.
        Eğer bu iki random sayı 12 den küçükse "Exception" versin ve mesaj olarak ("Sayı 12'den küçük ise hata verir") yazsın.

        Methodu main methodunda çağırın ve kodun düzgün çalışmasını sağlayın. (Aksaklığı giderin)

       */


        int random1=(int)(Math.random()*10+1);
        int random2=(int)(Math.random()*10+1);

        System.out.println(random1+random2);

        if (random1+random2<12) {

            throw new Exception("Sayi 12 den kucuk ise hata ver...");
        }
}

    public static void main(String[] args) {
       // randomSayi();
    }
}