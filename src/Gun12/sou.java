package Gun12;

import java.util.Scanner;

public class sou {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("a nin degeri  :");
        int a= sc.nextInt();

        System.out.print("b nin degeri  :");
        int b=sc.nextInt();

        System.out.print("c nin degeri  :");
        int c=sc.nextInt();
        System.out.println("enb = " + Math.max(Math.max(a,b),c));


    }

}
