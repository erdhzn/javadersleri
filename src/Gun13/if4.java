package Gun13;

import java.util.Scanner;

public class if4 {

    public static class ifelseif3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter 'a' value: ");
            int a = scan.nextInt();
            System.out.print("Enter 'b' value: ");
            int b = scan.nextInt();
            System.out.print("Enter 'c' value: ");
            int c = scan.nextInt();

            int d = (b*b) - (4*a*c);
            if(d > 0){
                System.out.println("x1: " + (-b + Math.sqrt(d))/(2 * a));
                System.out.println("x2: " + (-b - Math.sqrt(d))/(2 * a));
            }
            else if(d == 0){
                System.out.println("x: " + (-b / 2 * a));
            }
            else{
                System.out.println("no square root");
            }
        }
    }
}
