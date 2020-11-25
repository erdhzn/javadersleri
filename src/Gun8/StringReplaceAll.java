package Gun8;

public class StringReplaceAll {
    public static void main(String[] args) {
        // replaceall: replace gibi calisir, farkli kritere gore degisir

        String text= "mErHaBa Dunya";

        System.out.println("orijinal hali "+ "text");
        System.out.println("a,b,n leri _ yapilmis hali "+ text.replaceAll("aba ", "___"));
        System.out.println("buyuk harflerin  + yapilmis hali "+ text.replaceAll("[A-Z]", "___"));




    }
}
