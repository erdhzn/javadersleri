package Gun38.nonAccessModifier.finalModifier.Example2;

public class persons {
    public static void main(String[] args) {
        
        person kisi1= new person("erdogan", 13);
        //kisi1.fingerprintCode=10;// deger degistirilemez 
        // cunku ilk degeri aldi
        
        person kisi2 = new person("ali",10);
        
        //kisi2.fingerprintCode=17; degisrtirilemez.

        System.out.println("kisi1 = " + kisi1);
        System.out.println("kisi2 = " + kisi2);
    }
}
