package Gun49.Task3;

public class ABMain {
    public static void main(String[] args) {
         A a= new A();
        System.out.println("a olusturuldugunda  = " + A.mesaj);

        B b= new B();
        System.out.println(" b olusturulduguinda  = " + B.mesaj);

        System.out.println("b den sonra a nin durumu   = " + A.mesaj);

        // static degiskenlerdrin oldugu claslardan olusturulan subclaslarda , static degiskenin degeri
        // degistirildiginde , super classdaki  de degisir
        // cunku static degiskenler hafizada tek bir degeri gosteririr


    }
}
