package mentoring.TRYCATCH;

public class ORNEK4 {
    public static void main(String[] args) {

        System.out.println("Balatiloiyor ");
        int a=0;

        try{
            a=2/0;
        } catch (Exception hata){
            hata.printStackTrace();
        }
        System.out.println("Bitiriliyor");
    }
}
