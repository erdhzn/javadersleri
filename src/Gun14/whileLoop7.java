package Gun14;

import java.util.Scanner;

public class whileLoop7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        // kullanicidan 5 sayi isteyiniz , bu sayilardan en buyugunu bularak yazdriniz .

        int num=5, max=0;

        while (num>0){
            System.out.print("Sayi giriniz =");
            int m = sc.nextInt();
            if (max<m) max=m;
            num--;
        }
        System.out.println(max);


    }
}
