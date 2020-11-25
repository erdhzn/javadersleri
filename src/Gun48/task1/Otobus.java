package Gun48.task1;

public class Otobus  extends Arac{
    int yolcuSayisi;

    public Otobus(String renk, String model, int motor, int yolcuSayisi) {
        super(renk, model, motor);
        this.yolcuSayisi=yolcuSayisi;


    }

    @Override
    public String toString() {
        return "Otobus{" +
                "renk='" + getRenk() + '\'' +
                ", model='" + model + '\'' +
                ", motor=" + getMotor() +
                "yolcuSayisi=" + yolcuSayisi +
                '}';
    }
}
