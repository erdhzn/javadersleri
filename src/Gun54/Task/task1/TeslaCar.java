package Gun54.Task.task1;

public class TeslaCar  extends Vehicle implements IElectric{


    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return " 2 yilda bir batarya degisrit ";
    }

    @Override
    public String drive() {
        return "hizli sure , atomatik pilot sur";
    }
}
