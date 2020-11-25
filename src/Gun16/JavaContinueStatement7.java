package Gun16;

import java.util.Scanner;

public class JavaContinueStatement7 {

    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=oku.nextLine();

        for(int i=0; i< cumle.length() ; i++)
        {
            if (cumle.charAt(i) == 'a' || cumle.charAt(i)==' ')
                continue; // continue çalıştığı anda artışa direk gider, yani döngünün devamı
            // bu adım çalışmaz.

            System.out.println(cumle.charAt(i));
        }
    }

    }

