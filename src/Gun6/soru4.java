package Gun6;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {

        Scanner oku= new Scanner (System.in);
        System.out.print("lutfen kac bilet isteddiginizi giriniz =");

        int bilet= oku.nextInt();
        System.out.print("sigorta istiyor musunuz =");

        boolean sigorta = oku.nextBoolean();
        System.out.println("bilet :" +bilet+ " " +"sigorta ="+sigorta);

    }
}
