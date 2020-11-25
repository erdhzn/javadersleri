package Gun8;

public class StringEndsWith {
    public static void main(String[] args) {
        //String text= "merhaba dunya";
        //System.out.println("cumle merhaba ile mi bitiyor? :" + text.endsWith("merhaba"));
        //System.out.println("cumle merhaba ile mi bitiyor? :" + text.endsWith("merhaba"));
        //System.out.println("cumle dunya ile mi bitiyor? :" + text.endsWith("dunya"));


   String text = " bugun hava yagmurlu";
        System.out.println(" yagmurlu ile mi bitiyor?: "+ text.endsWith("hava"));
        System.out.println(" yagmurlu ile mi bitiyor?: "+ text.endsWith("yagmurlu"));
        System.out.println(" yagmurlu ile mi bitiyor?: "+ text.endsWith("bugun"));
        System.out.println(" va ile mi bitiyor?: "+ text.endsWith("va"));
        System.out.println(" yagmu ile mi bitiyor?: "+ text.endsWith("yagmu"));



    }
}
