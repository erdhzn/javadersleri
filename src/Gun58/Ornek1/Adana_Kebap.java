package Gun58.Ornek1;

import Gun55.Ornekler.ornek3.Food;

class   Adana_Kebap implements IFood{
    void marinade (){
        System.out.println("marine edil istir ");
    }
    void grill(){
        System.out.println("kebap hazirlaniyor");
    }


    @Override
    public void taste() {
        System.out.println("siparsiniz hazirlaniyor ");

    }

    @Override
    public double ucret() {
        return 5.0;
    }
}