package Gun53.Ornekler.Ornek2;

public class GrafikMain {
    public static void main(String[] args) {
        // bir interface den bir cok class implemente edilebilir
        Cember cember= new Cember();
        Dikdortgen dd= new Dikdortgen();

        cember.ciz();
        dd.ciz();
        // interface lerden nesen uretilemez fajkat referand tipi olusuturabilir
        ICizilebilir cember2= new Cember();
        cember2.ciz();

    }

}
