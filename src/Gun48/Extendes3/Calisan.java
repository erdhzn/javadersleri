package Gun48.Extendes3;

public class Calisan {
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    private String isim ;
    protected double maas;// bu siniftan uretileler ulasabilir
    int maasKatsayisi;

    public Calisan(String ismi, double maas, int maasKatsayisi) {
        this.isim= ismi;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ismi='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }

    public double maasHesapla()
    {
        return this.maas *maasKatsayisi;



    }

}
