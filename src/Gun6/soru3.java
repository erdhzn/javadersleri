package Gun6;

import java.util.Scanner;

public class soru3 {

    public static void main(String[] args) {

        // Kullanicidan boy  ve kilo bilgisini (ondalikli) alip ekrana tek satirda yazdiriniz.

        Scanner scanner=  new Scanner(System.in);

        System.out.print( " Boyunuz :");
        double boy = scanner.nextDouble();

        System.out.print("Kilonuz :");
        double kilo = scanner.nextDouble();


        System.out.println("Boyunuz ve kilonuz  = "+ boy + " "+kilo);

        System.out.println(" boy =" + boy+ "  kilo=" +kilo);




        // kullanicidan kac bilet istedgini ve sigorta isteyip istemedigini boolen olarak alip ekrana yaziniz.

    }
}
