package Gun53.Ornekler.Task.task1;

public class GeoMain {
    public static void main(String[] args) {
        Dikdortgen dd= new Dikdortgen();
        System.out.println("DDnin alani :"+dd.alani(4,5));
        System.out.println("DDnin cevresi :"+dd.cevresi(4,5));

        Cember cem= new Cember ();
        System.out.println("Cemberin alani :"+cem.alani(5));
        System.out.println("Cemberin cevresi :"+cem.cevresi(5));

        Kare kare= new Kare();
        System.out.println("Karenin alani :"+dd.alani(4,4));
        System.out.println("Karenin cevresi  :"+dd.cevresi(4,4));



    }
}
