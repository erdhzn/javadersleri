package Gun48.Extends1;

public class Yonetici {
    String ad;
    String Soyad;
    int yas;
    Double maas;
    String departman;
    int  sicilNo;
    int bagliPersonelSayisi;
    double gorevTazminati;

    public double getMaas(){return this.maas;}


        public void zamYap(int yuzde)
        {
            System.out.println(yuzde+ "peersonele zam yapildi...");
        }
    }

