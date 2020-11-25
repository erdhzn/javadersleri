package Gun48.Extends1;

public class SirketMain {
    public static void main(String[] args) {
        // personelein her fiedlarini kullanabilkuyor
        // erisim izni olunca

        Yonetisi2 mudur= new Yonetisi2();
        mudur.departman="Destek Birimi ";

        // hem kendi hem de personel metodlaruini  kullanabiloyor
        // erisim izni olunca
        mudur.getMaas();
        mudur.zamYap(10);

    }
}
