package Gun54.Task.task1;

public interface IElectric extends IVechile{
    final static int batteryLife=100;

    String changeBattery();
    //soyut yani süslü parantezli kısmı olmayan,
    // yani gövdesi olmayan
    // sadece adı ve paramatereleri olan metodlara
    // Abstract Metod denir.

    // Interface lerde sadece aşağıdaki 2 şekilde gövdeli
    // metod kullanılabilir

    // default belirteciyle, implemente zorunlu değil.
    default void print()
    {
        System.out.println("default belirteciyle metod yazılabilir.");
    }

    // veya static şekilde
    static void autoPilot()
    {
        System.out.println("otonom sürüş modu.");
    }





}
