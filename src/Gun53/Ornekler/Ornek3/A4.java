package Gun53.Ornekler.Ornek3;

public class A4 implements IYazdirilabilir, IGosterilebilir {
    @Override
    public void yaz() {
        System.out.println("Yazdirlildi...");

    }

    @Override
    public void goster() {
        System.out.println("Gosterildi....");

    }
}
