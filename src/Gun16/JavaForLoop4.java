package Gun16;

import java.util.Scanner;

public class JavaForLoop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // girilen bir sayinin faktoriyelini hesaplayiniz.
        // 5!=> 5 4 3 2 1


        System.out.print(" sayı girin: ");
        int sayı=sc.nextInt();
        int faktoriyel=1;
        for (int i=1;i<=sayı;i++){
            faktoriyel*=i;
        } System.out.println("faktoriyel = " + faktoriyel);
    }
}
