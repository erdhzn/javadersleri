package Gun38.nonAccessModifier.finalModifier.Example3;

public class Ex3 {
    final  String name;

    public Ex3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
            Ex3 ornek1=new Ex3("Ayse");
            Ex3 ornek2=new Ex3("Ali");

          //  ornek1.name="ali"; final oldugu icin ilk deger sonrasi tekrar deger atayamazsin
          //  ornek2.name="zeynep";



        System.out.println("ornek1.name = " + ornek1.name);
        System.out.println("ornek2 = " + ornek2.name);


    }
}
