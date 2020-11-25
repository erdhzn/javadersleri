package Gun11;

import java.util.Scanner;

public class IfElseGununSorulari1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //bir otopark ucret hesaplamasi yapilmak isteniyor
        //o-2 saat arasi 5 euro
        //2-5 arasi 10 euro
        // 5 saatten sonra 15 euto
        // saat girildiginde ucreti yazdiriniz.
        System.out.print(" otoparki kac saat kullanmayi dusunuyorsunuz  :");
        int time=sc.nextInt();
        if (time<=2 ) {
            System.out.println("lutfen 5 euro odeyiniz ");
        }
        else
            if (time <5)
            System.out.println("lutfen 10 euro odeyiniz ");

            else
                System.out.println("lutfen 15 euro odeyiniz...");


    }
}
