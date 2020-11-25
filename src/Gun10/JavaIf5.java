package Gun10;

import java.util.Scanner;

public class JavaIf5 {
    public static void main(String[] args) {
        Scanner oku= new Scanner (System.in);
        System.out.print("Bir sayi giriniz=");
        // girilen sayinin birler basamaini yaziriniz
        // soru yukaridaki soru - ise calismadi - olmasi durumunda da calismayi nasil yapariz

        int sayi =oku.nextInt();

        if (sayi<0)
            sayi= sayi*-1;
        int birler = sayi %10;
        if (birler==0) System.out.println("sifir");
        if (birler==1) System.out.println("bir");
        if (birler==2) System.out.println("iki");
        if (birler==3) System.out.println("uc");
        if (birler==4) System.out.println("dort");
        if (birler==5) System.out.println("bes");
        if (birler==6) System.out.println("alti");
        if (birler==7) System.out.println("yedi");
        if (birler==8) System.out.println("sekiz");
        if (birler==9) System.out.println("dokuz");

        // soru yukaridaki soru - ise calismadi - olmasi durumunda da calismayi nasil yapariz

    }
}
