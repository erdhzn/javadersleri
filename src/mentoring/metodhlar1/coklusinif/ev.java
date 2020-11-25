package mentoring.metodhlar1.coklusinif;

public class ev {
    public static void main(String[] args) {


        yemek market = new yemek();
        market.patlican=6;
        market.domates=0.5;
        market.biber=0.5;
        market.biberAciMi=false;
        market.sogan=0.5;
        market.kiyma=0.5;
        market.sarimsak=4;
        market.zeytinyagi=1;

        System.out.println("yemek yapmak icin gerekli olan malzemeler : ");
        System.out.println(market.patlican);
        System.out.println(market.domates);
        System.out.println(market.biber);
        System.out.println(market.sogan);
        System.out.println(market.biberAciMi);
        System.out.println(market.kiyma);
        System.out.println(market.sarimsak);
        System.out.println(market.zeytinyagi);




    }
}