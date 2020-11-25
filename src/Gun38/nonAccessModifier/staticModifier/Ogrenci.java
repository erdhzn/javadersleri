package Gun38.nonAccessModifier.staticModifier;

public class Ogrenci { // TODO STATIC NEREDE ISE YARIYOR

    String ad;
    String soyad;
    static String okulAd="Yildirim";
    // Static kullanilan sebebi hafizayi gereksiz kullnamktan kacinmak

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
       // this.okulAd = okulAd;
    }
    void print(){
        System.out.println(ad+" "+soyad+" "+okulAd);
    }
}
