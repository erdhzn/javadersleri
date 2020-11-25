package Gun48.Extends2;

public class Kopek  extends Hayvan {
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi); // super : superclasssi isaret ediuyor

    }
    @Override

    public void konustu()
    {

        System.out.println("havladi...");
    }
}
