package Gun51.task1;

public class Calisan extends kisi{

    private double maas;
    public Calisan(String isim, String adres, Okul okul,UyeTipi uyeTipi, double Maas) {
        super(isim, adres, okul, uyeTipi);
        setMaas(maas);

    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ getMaas();
    }
}
