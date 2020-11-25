package Gun48.task2;

public class Kare  extends Dikdortgen{

    public Kare(double genislik, double uzunluk) {
        super(genislik, uzunluk);
    }

    public Kare(int i) {
        super();
    }

    @Override
    public String toString() {
        return "Kare{"+
                "Alan=" + getAlan()+
                ",Cevre = "+ getCevre()+
                '}';
    }
}
