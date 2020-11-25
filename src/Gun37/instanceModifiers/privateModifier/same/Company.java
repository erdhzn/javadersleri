package Gun37.instanceModifiers.privateModifier.same;

public class Company {
    public static void main(String[] args) {

        Person personel= new Person();

        personel.id=1;
        personel.name="Ahmet";
        personel.surname="ahmet";
        //personel.password="1234";
        // burasi private oldugundan direkt erisilemez
        personel.SifreBelirle("1234abcd");
    personel.SifreGoster();
    }
}
