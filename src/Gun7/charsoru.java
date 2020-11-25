package Gun7;

import java.util.Scanner;

public class charsoru {
    public static void main(String[] args) {

        //

        System.out.print("bir kelime giriniz :");
        Scanner oku = new Scanner(System.in);
        String okunanKelime= oku.nextLine();
        // uzunluk adedi veriyordu, son index i ise bize length-1 son karakteri veririr
        int uzunluk=okunanKelime.length();
        char sonKarakter = okunanKelime.charAt(uzunluk-1);
        System.out.println("sonKarakter = " + sonKarakter);




    }

}
