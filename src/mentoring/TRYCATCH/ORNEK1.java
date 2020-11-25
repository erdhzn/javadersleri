package mentoring.TRYCATCH;

public class ORNEK1 {

    public static void main(String[] args) {


        System.out.println(" Kodunzu baslatiloiyor ......");
        int []arr=  new int [3];

        try{
            arr[4]=10;
        } catch (ArrayIndexOutOfBoundsException arrayHatasi){

            System.out.println(arrayHatasi.getMessage());
        }

        System.out.println("Kodumuz Bitiriliyor ......");
    }
}
