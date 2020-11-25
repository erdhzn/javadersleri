package Gun14;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi=oku.nextInt();
        
        int toplam=0;
         while (sayi>0){
             
             toplam= toplam +sayi;
             sayi--;

             System.out.println("toplam = " + toplam);

         }
        
        
        
    }
}
