package Gun37.instanceModifiers.protectedModifier.other;

import Gun37.instanceModifiers.protectedModifier.same.Doctor;

public class Hastane2 {
    public static void main(String[] args) {

        // protected oldugunda  default gibi
        // diger paketlerden kullanilamiyor

       // Doctor dr3= new Doctor()
        Doctor dr4= new Doctor("Omer");

        // ersiim belirteci protected oldugundan ulasilmaz
        //dr4.print();
    }
}
