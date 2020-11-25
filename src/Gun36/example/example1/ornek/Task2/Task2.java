package Gun36.example.example1.ornek.Task2;

public class Task2 {
    //bir banka clasi tanimlayiniz
    // 3 adet fie;ds ekleyiniz
    // 3 adet constructor ekleyini
    // toString metodu olusuutun
    // 3 tane nesne olutrun meinde yazdirin

    public static void main(String[] args) {
        Bank banka1=new Bank("Ziraat","Guzel",12);
        Bank banka2=new Bank("Ciftlik","YUumurta");
        Bank banka3=new Bank("Akbank");

        System.out.println("banka1 = " + banka1);
        System.out.println("banka2 = " + banka2);
        System.out.println("banka3 = " + banka3);
    }

}
