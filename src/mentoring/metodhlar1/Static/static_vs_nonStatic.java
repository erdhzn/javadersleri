package mentoring.metodhlar1.Static;

public class static_vs_nonStatic {

    // todo = void : hyiclik demektir
    public static void buMethodStatic (){

        System.out.println("Merhaba ");
    }
    public static void buMethodStaticDegil(){
        System.out.println("Selamlar ");

    }

    public  void main(String[] args) {
        buMethodStatic();   // STATIC OLDUGU ZAAMNA
        static_vs_nonStatic yeniObje= new static_vs_nonStatic(); // STTAIC OLOMADIGI ZAMANA
        yeniObje.buMethodStaticDegil();

    }
}
