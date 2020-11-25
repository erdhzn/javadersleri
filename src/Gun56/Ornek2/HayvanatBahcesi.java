package Gun56.Ornek2;

import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {


        kedi kedi= new kedi();
        // kedi.setId();
         kedi.setIsim("minnos");
         kedi.setVahsi(false);
         kedi.setDogumTarihi(LocalDate.of(2018,1,5));
        System.out.println(kedi);
//    kedi.yiyecegi();
//    kedi.yemekMiktari();
//    kedi.uykuSuresi();
//    kedi.sesi();

    kartal kartal= new kartal();
  //  kartal.setId();
    kartal.setIsim("gezgin");
    kartal.setVahsi(true);
    kartal.setDogumTarihi(LocalDate.of(2018,1,6));
        System.out.println(kartal);
//        kartal.yiyecegi();
//        kartal.uykuSuresi();
//        kartal.yemekMiktari();
//        kartal.sesi();


        System.out.println(Hayvan.sayac);
    }

}
