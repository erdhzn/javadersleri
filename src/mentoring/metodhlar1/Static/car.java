package mentoring.metodhlar1.Static;

public class car {

    // todo static olmayan method
    public void tamGaz (){

        System.out.println(" bu araba cok hizli !!!!");

    }
    public void maxSpeed(int speed ){

        System.out.println("bu arabanin max hizi: "+ speed);
    }

    public static void main(String[] args) {
        car myCar=new car();
        myCar.tamGaz();
        System.out.println("================");
        myCar.maxSpeed(500);

    }
}
