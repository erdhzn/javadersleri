package Gun10;

import java.util.jar.JarOutputStream;

public class JavaComparisonOperators {

    public static void main(String[] args) {
        int a=50;
        int b= 50 ;
        System.out.println("a, b ye esit mi =" + (a==b));
        System.out.println("a b den farkli mi = "+(a!=b));

        System.out.println("a be den buyuk mu = "   +(a>b));
        System.out.println("a b den kucuk mu = "+ (a<b));

        System.out.println("a b den buyuk veya esit mi ="+(a>=b));

        System.out.println("a b den kucuk mu ve ya esit mi ="+(a<=b));
    }
}
