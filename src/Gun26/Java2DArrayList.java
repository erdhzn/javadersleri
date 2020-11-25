package Gun26;

import java.util.ArrayList;

public class Java2DArrayList {
    public static void main(String[] args) {
        /***********************/
        int sayi = 5; // tek bir rakam saklayabilen değişken
        int[] dizi = new int[5]; // 5 adet rakam saklayabilen değişken.
        int[][] mat2 = new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<Integer> arrList = new ArrayList<Integer>(); // istenildiği kadar değişken eklenebilir
        /***********************/


        int[][] mat = new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<ArrayList<Integer>> notlaraArrayList = new ArrayList<>();

        ArrayList<Integer> matNotlar = new ArrayList<>();

        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>();

        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);
        kimNotlar.add(35);


        notlaraArrayList.add(matNotlar);//burada tanimlmada netin loistesi ise ona uygun degisleni ekledik
        notlaraArrayList.add(turNotlar);
        notlaraArrayList.add(kimNotlar);

        // for ( int i=0; i<matNotlar.size ();i++){
        //      System.out.println("matNotlar = " + matNotlar.get(i));
        //  }
        //  for (int i = 0; i <matNotlar.size() ; i++) {

        // System.out.println("notlaraArrayList = " + notlaraArrayList);
        for (int i = 0; i < notlaraArrayList.size(); i++) {
            //System.out.println("notlaraArrayList = " + notlaraArrayList.get(i));

            for (int j = 0; j < notlaraArrayList.get(i).size(); j++) {
                System.out.println("i yapragindaki j.not = " + notlaraArrayList.get(i).get(j));
            }
        }

        // metoda dersin nisunu gonderecegim bana ortalamasinin verecek

        int matOrt = dersOrtalamaBul(0, notlaraArrayList);
        System.out.println("matOrt = " + matOrt);

        int turOrt = dersOrtalamaBul(0, notlaraArrayList);
        System.out.println("turOrt = " + turOrt);

        int kimOrt = dersOrtalamaBul(0, notlaraArrayList);

        System.out.println("kimOrt = " + kimOrt);
    }

    private static int dersOrtalamaBul(int i, ArrayList<ArrayList<Integer>> notlaraArrayList) {

        int toplam = 0;

       /* Object dersNo;
        for(int i = 0; i<notlarArrList.get(dersNo).size(); i++)
        {
            toplam = toplam + notlarArrList.get(dersNo).get(i);
        }

        return toplam/notlarArrList.get(dersNo).size();
*/
        return toplam;
    }
}

