package m;

import java.util.Scanner;

public class bolme {
    public static void main(String[] args) {
            Scanner sc= new Scanner (System.in);
         // int num1= sc.nextInt();
           //.. int num2= sc.nextInt();
        //System.out.println(num1/num2);

        String value= "ALMANYA";
        for (int i=0 ;i<value.length();i++){

            char letter =value.charAt(i);
            System.out.println(letter);
        }

    }
}
