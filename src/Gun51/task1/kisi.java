package Gun51.task1;

public class kisi {


  private  String isim;
    private  String adres;
    private  Okul okul;
    private UyeTipi UyeTipi;

    public kisi(String isim, String adres, Okul okul,UyeTipi uyeTipi) {
        setIsim(isim);
        setAdres(adres);
      setOkul(okul);
        setUyeTipi(UyeTipi);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    public Gun51.task1.UyeTipi getUyeTipi() {
        return UyeTipi;
    }

    public void setUyeTipi(Gun51.task1.UyeTipi uyeTipi) {
        UyeTipi = uyeTipi;
    }

    @Override
    public String toString() {
        return "kisi{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", okul="+getOkul().getIsim()+
              //  ", okul=" + okul + // bu bolum main de okul toString metodu calistirnca  calisan ve ogrenci
                // un=st classi olna kisi sinifindaki buradaki okul degiskenini
                // tekrar cagirarark sonsuz dongu olusturdugundan Runtime Error verdi
                // bu yuzden kaldirdik.
//                Kendi Kendini çağıran metodlara Recursive Metod denir.
//
//        Main de
//
//        println(okul)-> okul.toString(); -> ogrencileri (Ogrenci.toString) -> kisi.toString() -> okul.toString()
                ", UyeTipi=" + UyeTipi +
                '}';
    }
}
