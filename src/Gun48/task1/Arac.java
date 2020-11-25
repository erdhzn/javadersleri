package Gun48.task1;

public class Arac {
    // arac isimli bir super class olustuiturunuz , fielsd renk motor , model

    // consructor ekleyiniz
    // bu siniftan Otobus sibifinin uretiniz , otobusun ayrica yolcu sayisi fieldini  ekleyiniz
    // bir AracPark ISIMLI icinde main olan bir sin if olusturnuz ve
    // otobusten  nesne olusturarak , otobusun ozelliklerinin  tumunu ekrana yazdiriniz .

    private String renk;
    protected String  model;
   private  int motor;

    public Arac(String renk, String model, int motor) {
        setRenk(renk);
        setModel(model);
        setMotor(motor);
    }
    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getMotor() {
        return motor;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }
    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motor=" + motor +
                '}';
    }
}
