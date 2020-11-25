package Gun36.example.example1.ornek.Task2;

public class Bank {
    String name;
    String slogan ;
    int Musterisayisi;

    public Bank (String name, String slogan, int Musterisayisi){

        this.name=name;
        this.slogan=slogan;
        this.Musterisayisi=Musterisayisi;
    }

    public Bank (String name, String slogan){

        this(name,slogan,0);
    }
    public Bank (String name){

     this(name," ",0);

}
    public Bank () {

        this.name = " ";
        this.slogan = " ";
        this.Musterisayisi = 0;


    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", slogan='" + slogan + '\'' +
                ", Musterisayisi=" + Musterisayisi +
                '}';


        //sifir cikmamamasi icin
        // String yazilacak=this.ad+" "+ this.Musterisayisi;
        //if (kurulus>0)
        //yazilacak+=" "+ kurulus;
        // return yazilacak 
    }
}

