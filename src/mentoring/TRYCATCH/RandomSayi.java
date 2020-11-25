package mentoring.TRYCATCH;

public class RandomSayi {
    static void randomSayi() throws Exception {

        int x=(int)(Math.random()*10+1);
        int y=(int)(Math.random()*10+1);
        int z=x+y;

        System.out.println(z);

        if (z<12) throw new Exception ("Sayı 12'den küçük ise hata verir");

    }

    public static void main(String[] args) {
        try {
            randomSayi();
        }catch (Exception ex){
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
    }
}

  /*
        randomSayi isminde static void bir method oluşturun.

        Bu method içerisinde iki int random sayı oluştusun. (0'dan 10 a kadar)

        Bu iki random sayının toplamını yazdırın.
        Eğer bu iki random sayı 12 den küçükse "Exception" versin ve mesaj olarak ("Sayı 12'den küçük ise hata verir") yazsın.

        Methodu main methodunda çağırın ve kodun düzgün çalışmasını sağlayın. (Aksaklığı giderin)

       */
