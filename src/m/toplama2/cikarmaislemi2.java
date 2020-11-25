package m.toplama2;

import java.util.Scanner;

public class cikarmaislemi2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        byte num2 = sc.nextByte();
        byte num3 = sc.nextByte();  // max byte 127 min byte 128

        System.out.println(num1 - num2 - num3);

    }
}
