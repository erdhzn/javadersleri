package Gun58.Ornek1;

public class TechnoKitchen {
    public static void pisir (IFood yemek ){
        if (yemek instanceof Adana_Kebap){
            Adana_Kebap adanaKebap= new Adana_Kebap();
            adanaKebap.marinade();
            adanaKebap.grill();
        }
        if (yemek instanceof Lahmacun){
            Lahmacun lahmacun= new Lahmacun();
            lahmacun.dough();
            lahmacun.topping();
            lahmacun.bake();
        }
        if (yemek instanceof Borsh){
            Borsh borsh = new Borsh();
            borsh.boil();
        }
        if (yemek instanceof Palov){
            Palov palov= new Palov();
            palov.fry();
            palov.boil();
        }
    }

}
