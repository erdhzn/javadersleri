package Gun12;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class javaRandom9 {
    public static void main(String[] args) {
        // kullanicidan alt ve ust degerleri isteyerek random sayi uretiniz
        // ve uretilen sayiyi ekrana yazdiriniz
    Scanner sc= new Scanner (System.in);
        System.out.print("Alt deger=");

        int min= sc.nextInt();

        System.out.print("ust deger ");
        int max = sc.nextInt();

        int numberInRange = (int) (Math.random()*((max-min)+1)) +min;
        System.out.println("numberInRange = " + numberInRange);
    }
}

