package mentoring;

import java.util.Scanner;

public class recep1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        // benim adim erdogan soydim hozan yasim 37 boyum 1,80 ve cinsyetim erkek.
        String name,surname, gender;

        int age;
        double boy;

        System.out.print("adinizi girin :");
         name = scan. nextLine();

        System.out.print("soyadiniznn girin :");
        surname = scan.nextLine();

        System.out.print("yasiniz :");
        age= scan.nextInt();
        scan.nextLine();

        System.out.print("boyunuzu giriniz :");
        boy=scan.nextDouble();
        scan.nextLine();

        System.out.print("cinsiyetiniz :");
        gender=scan.nextLine();
        scan.nextLine();

        System.out.println("benim adim " + name +" soyadim " +surname+ "." +" yasim " +age+ ","+" boyum "+ boy+"ve cinsiyet");

    }
}
