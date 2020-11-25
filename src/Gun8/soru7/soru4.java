package Gun8.soru7;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);

        System.out.println("bir strig giriniz= ");
        String text= oku.nextLine();

        boolean boslukVarmi = text.contains(" ");
        System.out.println("boslukVarmi = " + boslukVarmi);
        
        boolean bosMu = text.isEmpty();
        System.out.println("bosMu = " + bosMu);

        

    }
}
