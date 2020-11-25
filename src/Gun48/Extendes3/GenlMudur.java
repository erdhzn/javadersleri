package Gun48.Extendes3;

public class GenlMudur extends Calisan {
    double tazminat ;

    public GenlMudur(String ismi, double maas, int maasKatsayisi, double tazminat) {
        super(ismi, maas, maasKatsayisi);
        this.tazminat = tazminat;
        this.tazminat= tazminat;
    }

    @Override
    public double maasHesapla() {
       // return super.maas*super.maasKatsayisi*this.tazminat;
        return super.maasHesapla()*this.tazminat;

    }

    @Override
    public String toString() {
        return super.toString()+" "+this.tazminat;
    }
}
