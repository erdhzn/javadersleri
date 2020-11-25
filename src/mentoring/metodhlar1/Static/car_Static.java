package mentoring.metodhlar1.Static;

public class car_Static {
    public static void tamGaz (){

        System.out.println(" bu araba cok hizli !!!!");

    }
    public static void maxSpeed(int speed ){

        System.out.println("bu arabanin max hizi: "+ speed);
    }

    public static void main(String[] args) {
        car myCar = new car();
        tamGaz();
        maxSpeed(500);
    }

    }
