package Gun48.task2;

public class Sekil {
    //Sekil
    //   Cember
    //   Dikdortgen
    //         Kare

    @Override
    public String toString() {
        return "Sekil : Bilgi yok ";
    }

    public double getAlan() {
        throw new RuntimeException("Bu sinifin bu metod ozelligi yoktur ");
    }

    public double getCevre() {
        throw new RuntimeException("Bu sinifa bu metod  iplemente edilmemistir.");
    }
}