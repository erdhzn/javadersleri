package Gun13;

import java.util.Scanner;

public class if3 {

    public static void main(String[] args) {
        // kat sayialri verilen 2 bilinmeyenli denklermin kokklerini bulunuz
        // ax2+ bx=c
        // kullanicidan a, b,c hi okutun
        // delta

        Scanner number=  new Scanner (System.in);
        System.out.print("a yi giriniz :");
        int a = number.nextInt();

        System.out.print("b yi girinz :");
        int b = number.nextInt();

        System.out.print("c yi giriniz  :");
        int c = number.nextInt();

       int  delta=b*b-(4*a*c);

        if (delta >0){
            System.out.println("x1 ="+ ((-b+Math.sqrt(delta))/(2*a)));
            System.out.println("x2 ="+ ((-b+Math.sqrt(delta))/(2*a)));
        }
        else
            if (delta==0){
                System.out.println("x = " + (-b/2*a));
            }
            else
                System.out.println("kok yoktur ");
    }
}
