package Gun7;

public class javaContains {
    public static void main(String[] args) {
        // bir stringin icersindne karakterkerin var olup olmadigini kontrol eder.

        String str= "hello";
        System.out.println("llo var mi = " +str.contains(("llo")));
        System.out.println("o var mi =" + str.contains("o"));
        System.out.println("k var mi =" + str.contains("k"));
    }
}
