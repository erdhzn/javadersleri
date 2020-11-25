package Gun12;

import java.util.Scanner;

public class JavaTernary3 {

    public static void main(String[] args) {

        // kullanicinin girecegi sayi cift ise bir gift ataryiniz ,
        // tek ise "tek" aratyiniz ve ekrana yazdiriniz .

        Scanner sc= new Scanner (System.in);

        System.out.println("sayi =");
        int num= sc. nextInt();

        String text = "";
        if (num %2 == 0)
            text = "cift";

        else
            text="tek";
        System.out.println("text");

        // ternary seki (uclu operator)
       // text=(num %2 ==0) ?"cift": "tek";
       // System.out.println("text");

    }
}
