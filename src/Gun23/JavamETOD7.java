package Gun23;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class JavamETOD7 {
    public static void main(String[] args) {

        int[] dizi= new int [5];

        Scanner sc= new Scanner (System.in);
        for (int i =0; i<5;i++){
            System.out.println("Sayi giriniz =");
            dizi[i]= sc.nextInt();
        }
        System.out.println("once :" + Arrays.toString(dizi));
        System.out.println("sonra :" + Arrays.toString( teklereSifirAta(dizi)));
    }
    public static  int []teklereSifirAta(int[]dizi)
    {
        // eger dizinin elemani tek ise O ataniyor
        for (int i=0;i<dizi.length;i++){

            if (dizi[i]%2==1)
                dizi[i]=0;
        }
        return dizi;
    }
}
