package Gun24;

public class ArrayWapperClasses6 {
    public static void main(String[] args) {
        int a=5;
        String strInt= String.valueOf(a);

        Integer b=6;
        String strInteger=b.toString();//yani bu metodun icinde gereki cok metod car
        // icinde cokca metod olna tiplare Wrapper Class denir



        b=a;// boxing denir , basit olan tipin , kapsamli tioe atanmasina denir .
        a=b; //unboxing denir  yani kapsasmli tipim , basite atanmasina 
        double c=3.4;
        Double d=5.6;
        char e='F';
        Character f='Y';

        boolean g=true;
        Boolean h=false;

        float k=3.4f;
        Float l=5.6f;

    }
}
