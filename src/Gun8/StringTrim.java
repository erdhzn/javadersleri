package Gun8;

public class StringTrim {
    public static void main(String[] args) {


        // stringin basinda ve sonunda olan bosluk karaktrlerini temmizler

        String  text =".......HELLO........";
        System.out.println(">>>"+text.trim() + "<<<");

        System.out.println("orijinal hali = -> "+ text+"<-");
        System.out.println("bas ve sondaki bosluklarin temizlenmis hali =->" +text.trim()+"<-");

    }
}
