package Gun37.instanceModifiers.privateModifier.same;

public class Person {
    int id;
    String name;
    String surname;
    private String password;

    public void SifreBelirle (String sifre){

        if (sifre.length()>=8){

            this.password=sifre;
        }
        else
        {
            System.out.println(" ena z 8 karakter olmali ");
        }
    }


    public void SifreGoster()
    {

        System.out.println("****"+ this.password.substring(4));

    }

}
