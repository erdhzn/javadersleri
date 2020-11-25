package mentoring.Array;

public class Array8 {
    public static void main(String[] args) {
        //TODO DOGUM TARIHLERI ARASINDAKI / ISATERINI SPLIT METODU ILE KALDIRINUIZN

        String str= new String("20/08/1983");
        System.out.println("dogum gunu :");
        String [] array = str.split("/");

        for( String date: array){
            System.out.println(date);
        }
    }


}
