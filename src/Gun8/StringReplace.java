package Gun8;

public class StringReplace {
// replace : bir strinin icerisndeki istenen karakterlerin hepsini verilen yenisi ile degistirir.
    public static void main(String[] args) {
         String text ="merhaba dunya ";
      // System.out.println( text.replace("merhaba","koca"));

       // String text1= "BUGUN HAVA YAGMURLU MU BILMIYORUM AMA SANIRIM YAGACAK";
        //System.out.println(text1.replace("AMA" ,"KAR"));

        //System.out.println("orijinal hali = "+text);
        //System.out.println("a larin e olarak degisyirilmis hali ="+ text.replace('a','e'));

        String text3= "alamanyada yasamak ";
        System.out.println("orijinal hali= "+text3);
        System.out.println("a larin e olarak degistirilmis hali = " + text3.replace('a','e'));
        System.out.println("a larin i olarak degistirilmis hali = " + text3.replace('a','i'));
        System.out.println("a larin o olarak degistirilmis hali = " + text3.replace('a','o'));
        System.out.println("a larin u olarak degistirilmis hali = " + text3.replace('a','u'));
    }
}
