package METODH;

public class rakamsayisi {
    /*
     int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
      verilen Array icinde
    --> kac tane rakam oldugunu return eden  methodu yazdiriniz
     */
    public static void main(String[] args) {
        int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        System.out.println("2D Array icindeki sayilar:"+kacSayi(array));
    }

    private static int kacSayi(int[][] array) {
        int say=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                say++;

            }

        }
        return say;
    }
}
