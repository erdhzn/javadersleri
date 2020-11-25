package Gun48.Extendes3;

public class Firma {
    public static void main(String[] args) {
        Calisan calisan1= new Calisan("erdogan ",2000,2);
        System.out.println("calisan1.toString() = " + calisan1.toString());;
        System.out.println("calisan1.maasHesapla() = " + calisan1.maasHesapla());
    
        GenlMudur gm=new GenlMudur("ayse",6000,2,3);
        System.out.println("gm.toString() = " + gm.toString());
        System.out.println("gm.maasHesapla() = " + gm.maasHesapla());
    
    
    }
}
