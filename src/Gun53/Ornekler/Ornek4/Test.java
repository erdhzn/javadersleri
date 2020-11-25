package Gun53.Ornekler.Ornek4;

import Gun53.Ornekler.Ornek3.IGosterilebilir;
import Gun53.Ornekler.Ornek3.IYazdirilabilir;

public class Test   implements IGoster, IYazdir {


    @Override
    public void goster() {
        System.out.println("goster");

    }
    // implemente edilen interfaceler de aynı isim ve paramatrede
    // olan metdolardan bir tane yazmak yeterlidir,
    // problem oluşturmaz.

    @Override
    public void yaz() {
        System.out.println("yazdir");

    }
}

