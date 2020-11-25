package Gun9;

public class JavaArithmeticoperation4 {

    public static void main(String[] args) {
        int a=5;
        int b=2;
        int k=0;

        a++;// a nin degeri bir artar ==> a=a+1 le ayni   6
        ++a; // a nin degeri bir artar a=a+1 le ayni    7

        k=a++; //++ lar sagda oldugu icin , once k=a calisiri , sonra a=a+1 k=7 , a =d
        k=++a; // ++lar solda oldugu icin , once a=a+1 calisir  sonra k=a  a=9 , k=9

        a--;// a nin degeri bir azalir ==> a=a+1 le ayni   8
        --a; // a nin degeri bir azalir a=a+1 le ayni    7

        k=a--; //++ lar sagda oldugu icin , once k=a calisiri , sonra a=a-1 k=7 , a =6
        k=--a; // ++lar solda oldugu icin , once a=a+1 calisir  sonra k=a  a=5 , k=5



    }
}
