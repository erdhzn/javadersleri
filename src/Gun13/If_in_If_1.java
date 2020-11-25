package Gun13;

import java.util.Scanner;

public class If_in_If_1 {

    public static void main(String[] args) {
        // girlen bir sayinin ince 100 den kucuk ise 100 den kucuk yazsin
        // devaminda 50 den kucukse ,50 den kucuk yazdin
        // devaminda 25 ten kucukse 25 ten kucuk yazdin

        Scanner sc = new Scanner(System.in);
        System.out.println("sayi =");
        int number = sc.nextInt();
        if (number < 100) {
            System.out.println(" sayi 100 den kucuk");
            if (number < 50) {
                System.out.println("sayi 50 den kucuk");
                if (number < 25) {
                    System.out.println("sayi 25 ten kucuk");


                }
            }
        }
    }
}