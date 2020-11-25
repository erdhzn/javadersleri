package Gun7;

public class StringCharat {
    public static void main(String[] args) {
        // istenen noktadaki harfi verir.
        // harf sayimi baslarken 0 dan baslar. buna index denir

        
        String kelime= "MERHABA DUNYA";
        char harf= kelime.charAt(3);
        System.out.println("harf = " + harf);

        String kelime2="afyonkarahisarlastiramadiklarimizdan misiniz?";
        char harf2 = kelime2.charAt(15);
        System.out.println("harf2 = " + harf2);
    }
}
