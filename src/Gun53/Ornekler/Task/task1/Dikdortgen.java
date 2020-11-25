package Gun53.Ornekler.Task.task1;

public class Dikdortgen implements ISekil{

    @Override
    public int cevresi(int... dizi) {
        return dizi[0]+dizi[1]*2;
    }

    @Override
    public int alani(int... dizi) {
        return dizi[0]*dizi[1];
    }
}
