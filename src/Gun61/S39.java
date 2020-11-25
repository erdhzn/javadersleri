package Gun61;

public class S39 {

    public static void main(String[] args) {



    String shirts[][] = new String[2][2];

    shirts[0][0] = "red";
    shirts[0][1] = "blue";
    shirts[1][0] = "small";
    shirts[1][1] = "medium";

        for (String [] c: shirts) { // shirts 2 boyutlu diziyi : c ise her bir satırı temsil ediyor
        for (String s : c ) { // c gelen satırı : s ise satırdaki sıradaki elemanı temsil ediyor
            System.out.println(s + ":");
        }
    }

}
}
