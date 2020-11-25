package Gun12;

import java.util.Scanner;

public class sorular {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("x degeri");
        int x=sc.nextInt();

        System.out.println("y degeri");
        int y= sc.nextInt();

        if (x>0 &&y >0)
            System.out.println("A bolgesi");
        else
            if(x<0 && y<0)
        System.out.println("C bolgesi");
            else
                if (x<0 && y >0)
                    System.out.println("B bolgesionde ");
                else
                    if (x> 0 && y <0)
                        System.out.println(" D bolgesinde ");

                    else
                        System.out.println("eksen uzerinde");
    }
}
