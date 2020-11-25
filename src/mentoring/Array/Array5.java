package mentoring.Array;

public class Array5 {
    public static void main(String[] args) {

        int[] SayiArrayi={5,8,35,90,12};
        int toplam=0;
        for( int yeniSayi:SayiArrayi){
            toplam+=yeniSayi;
        }

        System.out.println("toplam ="+ toplam);
    }
}
