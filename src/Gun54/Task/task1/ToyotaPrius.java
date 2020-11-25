package Gun54.Task.task1;

public class ToyotaPrius  extends  Vehicle implements IGas,IElectric{


    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "50 km hiza kadar elektrik ile giderim ";
    }

    @Override
    public String chaneOil() {
        return "Kaliteli yag kullan";
    }
    @Override
    public String drive() {
        return "Rahat sur Toyatadasin";
    }
}
