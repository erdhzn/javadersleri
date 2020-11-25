package mentoring.TRYCATCH;

public class ORNEK3 {

    public static void main(String[] args) {

        System.out.println(" Kodunzu baslatiloiyor ......");
       int sayi=0;
       int []arr= new int [3];

       try{
           sayi=2;
           arr[4]=10;
       }
       catch (ArithmeticException bolmeHatasi){
           System.out.println(bolmeHatasi.getMessage());
       }
        catch (ArrayIndexOutOfBoundsException arrayHata){
            System.out.println(arrayHata.getMessage());

        }
       finally {
           System.out.println(" Finally her duruda calisir.");
       }
        System.out.println("Kodumuz Bitiriliyor ......");
    }
}
