package Gun58.Ornek1;

import Gun55.Ornekler.ornek3.Food;

public class Lahmacun implements IFood  {

    void dough(){
        System.out.println(" bol salatali hahmacun ");
    }
    void topping (){
        System.out.println("cok sicak ");

    }
    void bake  (){
        System.out.println("tas firinda hazirlndi ");
}

    @Override
    public void taste() {
        System.out.println("adanaya gitmeye gerek yok ");

    }

    @Override
    public double ucret() {
        return 2;
    }
}

