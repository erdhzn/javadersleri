package Gun54.Task.task1;

import java.util.ArrayList;

public class OtoGaleri {
    public static void main(String[] args) {
        TeslaCar tesla= new TeslaCar("Tesla p90", 2500);
        ToyotaPrius toyota= new ToyotaPrius("Prius",2000);
        bus otobus= new bus("302",6000);
        tesla.print();
        IElectric.autoPilot();


        ArrayList<Vehicle> arabalar = new ArrayList<>();
        ArrayList<IVechile> arabalar2 = new ArrayList<>();

        arabalar.add(tesla);
        arabalar.add(toyota);
        arabalar.add(otobus);


        for( Vehicle arac:arabalar)
        {
            System.out.println(arac.getClass().getSimpleName());
        }
    }
}
