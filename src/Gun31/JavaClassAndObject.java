package Gun31;

public class JavaClassAndObject {
    public static void main(String[] args) {


                Car car1= new Car(); // nesne eraba sinifindan turetildi
            car1.model= " seat leon";
            car1.motorHacmi=1400;
            car1.yili= 2009;


        System.out.println("car1 yili = " + car1.yili);
        System.out.println("car1 motorHacmi = " + car1.motorHacmi);
        System.out.println("car1 model = " + car1.model);
    }
}


// TODO 1. YONTEM
// araba sinfi
    class Car{
// propertie, attribite, fielda
    String model ;
    int yili;
    double motorHacmi;

    }