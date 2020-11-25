package m.kalanbulma;


import java.util.Scanner;

public class reminder {

    //TODO IKI INT BOLUMUNDEN KALANINI YAZINIZ
    // TODO SCANNER I KULLANINIZ

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int num1=  sc.nextInt();
        int num2 = sc.nextInt();

        int num3= num1%num2;
        System.out.println(num3);

    }
}
