package mentoring;

import java.util.Scanner;

public class NestedifElse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


    /*
            hava durumu ile ilgili sistem size "derece giriniz" sorusunu sorsun.

        int derece oluşturarak bir değer giriniz.

        havanın güneşli olup olmadıgını belirlemek için de         boolean sunny               oluşturunuz.

        eğer derece 40 tan fazla ise    "dışarısı çok sıcak!" yazsın ve eğer güneşli ise  (boolean=true ise)  ,   " ayn ı zamanda güneşli ! " yazsın.

        güneşli değil ise (boolean? false ise)       ,      "ve bulutlu "  yazsın.


        40 dereceden düşük ise dışarısı sıcak değil yazsın.

         */

        System.out.println("Hava sicakliginin girniz :");
        int derece=sc.nextInt();

        if (derece>40){
            boolean sunny = sc.nextBoolean();
            System.out.println("Disarisi cok sicak!");

            if (sunny==true)
                System.out.println(" Ayni zamanda gunesli");

            else
                System.out.println(" ve bulutlu..");
        }
        else
            System.out.println("Disatisi sicak degil");





}
}