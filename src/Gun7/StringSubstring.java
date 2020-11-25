package Gun7;

public class StringSubstring {
    public static void main(String[] args) {
        //substring : stringn belli bir bolumu alma islemi

        String text= "merhaba arkadaslar ";
        System.out.println( "1. bolum =" + text .substring(1,5));// 1 nolu indexten 5 e kadar. 5 dahil degil
        System.out.println("2. bolum ="+ text.substring(0,3));
        System.out.println("3. bolum ="+ text.substring(4));// verilen indexten sonun akadar al

        String strAlinan= text.substring(0,3);





    }
}
