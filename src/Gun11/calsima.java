package Gun11;

import java.util.Scanner;

public class calsima {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

       /* System.out.print("birinci sayiyi giriniz:");

        double number1= sc.nextDouble();

        System.out.print("ikinci sayiyingiriniz:");
        double number2=sc.nextDouble();

        if (number1> number2)
            System.out.println("double 1 is greater than double 2");
        else
            System.out.println("double 1 is smaller than double 2");*/


        System.out.println("birinci sayiyi giriniz :");
        Scanner scan= new Scanner (System.in);
        double number = scan.nextDouble();

        System.out.println("Ikinci sayiyi giriniz");
        double number2 = scan.nextDouble();

        if (number >number2)
            System.out.println("Hello WORLD");

        else
            System.out.println("I LOVE YOU");

    }

}


