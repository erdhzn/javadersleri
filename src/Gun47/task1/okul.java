package Gun47.task1;

import java.util.ArrayList;

public class okul {
    private String okulAd;
    private int maxOgrenciSayisi;
    private ArrayList<ogrenci> ogrenciler = new ArrayList<>();

    public okul(String okuAd, int maxOgrenciSayisi ) {
        setOkuAd(okulAd);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
        setOgrenciler(ogrenciler);
    }

    public String getOkuAd() {
        return okulAd;
    }

    public void setOkuAd(String okuAd) {
        this.okulAd = okuAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }
}
