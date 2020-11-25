package Gun54.Task.task1;

public class bus extends Vehicle implements IDisel {

    public bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDisel() {
        return "Dogayi az kirlet ";
    }

    @Override
    public String drive() {
        return "Dikkatli sur ";
    }
}
