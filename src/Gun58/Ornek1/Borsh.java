package Gun58.Ornek1;

public class Borsh implements IFood{
    void boil(){
        System.out.println("yemek kaynaamda ");
    }

    @Override
    public void taste() {
        System.out.println("parmakalra dikkat ");

    }

    @Override
    public double ucret() {
        return 3;
    }
}

