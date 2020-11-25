package Gun23;

public class JavaMetod7Soru {

    public static void main(String[] args) {

        ortalamaBulYaz("Ali", 60, 70, 85, 95, 100, 60);
        ortalamaBulYaz("mehmet", 60, 75, 55, 90);
        ortalamaBulYaz("can", 60, 70, 75);
        ortalamaBulYaz("mert", 60, 80, 85, 95, 60);

// .......... ile ilgili  2 kurallar var
        //1 - bir  metodda parametre olarak sadece 1 tane olanboir
        //2- her  zaman en sonda olmali

    }

    public static void ortalamaBulYaz(String isim, int... notlar) {
        double toplam = 0;
        for (int not : notlar) {
            toplam += not;
          //  for (int not : notlar) // foreach
            {
            }
            System.out.println(isim + " " + toplam / notlar.length);
        }
    }
}
