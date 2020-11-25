package Gun56.Ornek2;

import java.time.LocalDate;

public  abstract class Hayvan {
   static int sayac=1;


    public String isim;
    public  boolean vahsi;
    public LocalDate dogumTarihi;
    public int id;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    abstract void yiyecegi();
    abstract  void  yemekMiktari();
    abstract  void uykuSuresi();
    abstract  void sesi ();

    Hayvan()
    {
        Hayvan.sayac++;
        setId();
    }



    public static int getSayac() {
        return sayac;
    }

    public static int SayacArtir() {
        return sayac++;
    }





    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "id='"+ id +"\n" +
                "isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
}
