package Gun53.Ornekler.Task.task1;

public class Cember implements ISekil{
    @Override
    public int cevresi(int... dizi) {
        return (int)(2*dizi[0]*ISekil.PI);
    }

    @Override
    public int alani(int... dizi) {
        return (int)(ISekil.PI*dizi[0]*dizi[0]);
    }
}
