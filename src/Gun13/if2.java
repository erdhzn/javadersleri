package Gun13;

import java.util.Scanner;
// Soru : Kullanıcıdan  Fizik: 90   şeklinde not bilgisini alınız.
// >= 90 için A
// >= 80 için B
// >= 70 için C
// >= 60 için D
// >= 40 için E
// < 40 için F yazdırınız.

public class if2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ders ve Notu  : ");
        String dersNot=sc.nextLine();

       // int ogrNot = Integer.parseInt(dersNot.replace("[^0-9]",  ""));
        int ogrNot= Integer.parseInt(dersNot.substring(dersNot.indexOf(" ")+1));
        if(ogrNot>=90)
            System.out.println("A");
        else if(ogrNot>=80)
                System.out.println("B");
            else if (ogrNot >= 70)
                    System.out.println("C");
                    else if (ogrNot>=60)
                        System.out.println("D");
                       else if(ogrNot>=40)
                            System.out.println("E");
                           else
                                System.out.println("F");
                            }
                        }





