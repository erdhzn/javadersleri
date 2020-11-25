package METODH;

public class TestSonuc {
    /*
 ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz.

  //ogrencilerin cevaplari
  char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
*
* // cevap anahtari
  char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

  output:
  0 nolu ogrencinin 7 dogru cevabi var.
  1 nolu ogrencinin 6 dogru cevabi var.
           "           "
           "           "
           "           "
  7 nolu ogrencinin 7 dogru cevabi var.

*
*  */
    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

 // cevap anahtari
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
// metodu cagir
        testSonucu(keys,answers);
    }

    private static void testSonucu(char[] keys, char[][] answers) {
        for (int i = 0; i <answers.length ; i++) {
            int dogruCevap = 0;
            for (int j = 0; j < answers.length ; j++) {
                if(answers[i][j]==keys[j]){
                    dogruCevap++;


                }
            }
            System.out.println(i+" nolu ogrencinin "+ dogruCevap+" dogru cevabi var.");
        }
    }
}
