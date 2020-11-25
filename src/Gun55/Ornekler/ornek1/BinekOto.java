package Gun55.Ornekler.ornek1;

public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    public abstract String getMarka();


    public int getUretimYili()
    {
        return this.uretimYili;

    }
    public void setUretimYili(int uretimYili){
        this.uretimYili=uretimYili;
    }

}
