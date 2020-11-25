package Gun55.Ornekler.ornek2;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen dd= new Dikdortgen(4,5);
        dd.setName("Yeni dikdortgen");
        System.out.println(dd);
        dd.ciz();



        Cember cm=new Cember(6);
        cm.setName("yeni Çember");
        System.out.println(cm);
        System.out.println(cm.toString2());
        cm.ciz();
    }
}
