package Gun19;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // kullanicidan 5 adet meyve ismini bor duzute atadikta sonra
        // elmaisimi gecen meyvelerini ekrana bir dongude yazdiriniz

        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("meyve ismi  yaziniz=");
            arr[i] = sc.nextLine();
        }


        for (int i = 0; i < arr.length; i++) {

            if(arr[i].equalsIgnoreCase("elma"))

                System.out.println(arr[i]);
        }
    }
}
