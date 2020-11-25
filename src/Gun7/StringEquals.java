package Gun7;

public class StringEquals {
    public static void main(String[] args) {
        // 2 striingin esit olup olmadigini kontrol eder ve boolean degiskenidir

        String str= "merhaba";
        boolean birebirEsitMi = str.equals("merhaba");

        System.out.println("birebirEsitMi = " + birebirEsitMi);

        System.out.println("birebirEsitMi = " + str.equals("merhaba"));
    }
}
