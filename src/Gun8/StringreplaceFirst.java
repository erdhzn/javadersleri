package Gun8;

public class StringreplaceFirst {

    public static void main(String[] args) {

        // ([A-Z]) regex bununla buyuk harf aramasi yapilabilir

      //  String text = "bugun hava YAGMURLU MU ne cok bulutlu ama";
       // System.out.println(text.replaceFirst("[A-Z]","y"));

        String text = "merhaba be dunya";

        System.out.println("butun a larin nin deistigi hali + = " + text.replace('a','e'));
        System.out.println("butun a larin nin deistigi hali + = " + text.replaceFirst("a","e"));




    }
}
