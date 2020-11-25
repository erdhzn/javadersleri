package Gun11;

import java.util.Scanner;

public class ifelseLogic6 {

    public static void main(String[] args) {
        // girilen yeni bir passwor un kurallara uygunlugunu kontrol ediniz.
        // 1.en az 8 karakter olmali
        // 2. icinde pass kelimesi olmamamli
        //3 en fazla 12 karakter olmali
        Scanner sc= new Scanner(System.in);
        System.out.println("yeni bir sifre gir bakalim :");
        String text = sc.nextLine();
        if(text.length()>=8 && text.length()<=12 && !text.contains("pass"))
            System.out.println("Sifre dogru girdin..");
        else
            System.out.println(" yanlis sifre....Sifreni  mi unuttun yoksa...");

    }
}
