package mentoring.Array;

import java.util.Arrays;

public class arrayTerstenYazma {
    public static void main(String[] args) {
        //TODO verilen arrayin ilk ve son elemanin yazdirin
        //int[]nums={1,2,3,4,5}   ======>  [1,5]
/* TODO Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu alin.

        [C, o, n, g, u, r, a, t, u, l, a, t, i, o, n, s]
        [s, n, o, i, t, a, l, u, t, a, r, u, g, n, o, C]
        snoitalutarugnoC
        Cingritilitiins  // o ,a ve u harfini i ye donuster

 */


        String str= "Conguratulations" ;
        String [] arr=str.split("");

        System.out.println(Arrays.toString(arr));

        System.out.println("*******************************************");

        int counter=0;
        String [] yeniARR=new String [arr.length];
        for (int i=arr.length-1; i>0; i--){
            yeniARR[counter++]=arr[i];
        }


    }
}
