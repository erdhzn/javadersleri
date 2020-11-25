package Gun19;

import java.util.Scanner;

public class JavaSplit {
    public static void main(String[] args) {
        // kullanicidan alacaginiz bir cu leyi kelimlerine bolerek alt alta yazinin z

        Scanner sc=new Scanner(System.in);
        System.out.println("bir cumle girniz :");
        String cumle =sc.nextLine();

        String []  kelimeler=cumle .split (" ");
        // dizilerde length : dizideki elemanin sayisini verir
        for( int i=0;i<kelimeler.length; i++){

            System.out.println(kelimeler[i]);
        }
        // 2. yontem.........................
        for(String elemanDegeri : kelimeler)
        {
            System.out.println(elemanDegeri);
        }












    }
}
