package Gun6;

import java.util.Scanner;

public class soru7 {

    public static void main(String[] args) {
         // kullanician usarname (string), passwort (int) ve gizli soruyu (cumle)alip yazdir

        Scanner oku= new Scanner(System.in);
        System.out.print("Usarname: ");
    String username= oku.nextLine();

        Scanner oku2=new Scanner((System.in));
        System.out.print( " password: ");
        int password=oku2.nextInt();

        Scanner oku3=new Scanner((System.in));
        System.out.print("Gizlisoru :");
        String gizliSoru= oku.nextLine();
        // nextline :satir okuma
        //next :kelime okuma

        System.out.println(username+"\n" + password+"\n"+gizliSoru);



    }
}
