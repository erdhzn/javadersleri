package Gun43.JavaException;

import java.util.Scanner;

public class _3_JavaRuntimeExceptionEx1 {
    public static void main(String[] args) {
        Scanner  oku= new Scanner (System.in);

        System.out.print("1. sayiyi giriniz=");
        int a= oku.nextInt();

        System.out.print("2. sayiyi giriniz=");
        int b= oku.nextInt();

        System.out.print("a/b = " + a/b);

        //  a=4 b=2        a/b  cevap aliriz program sorunsuz calisir
        //  a=4  b=0        a/b   burda RunTimeEror Exeption oluyor
        //  a=3  b=fb       a/b  burda yine RunTimeEror oluyor
    }
}
