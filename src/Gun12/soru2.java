package Gun12;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x degeri");
        int x = sc.nextInt();

        System.out.print("y degeri");
        int y = sc.nextInt();
   if (x <-2|| x>8 || y>4 || y<1)
       System.out.println("Disinda ");

   else
       if (y< 4 && y >1 && x< 8&& x > -2)
           System.out.println("icinde");
       else
           System.out.println("Cizgi uzerinde");





    }
}
