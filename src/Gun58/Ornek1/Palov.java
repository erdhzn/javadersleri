package Gun58.Ornek1;

public class Palov implements IFood {

    void boil(){
        System.out.println("pismek uzere");
    }
    void fry(){
        System.out.println("bir birine yapismasin ");
    }

    @Override
    public void taste() {
        System.out.println("evde yapilmis gibi ");

    }

    @Override
    public double ucret() {
        return 4;
    }
}
