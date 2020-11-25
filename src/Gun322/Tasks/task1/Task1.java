package Gun322.Tasks.task1;

public class Task1 {
    // 1-Adım Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
    // 2- adim= cevre bulmak uzere   isminde bir metod yaziniz
    // 3. adim= dikdortgenin alaini bulan getArea isili birm metod yaziniz
    public static void main(String[] args) {

    Rectangle dikdortgen= new Rectangle();
    dikdortgen.width=5;
    dikdortgen.length=4;
        System.out.println("dikdortgen.getPerimeter() = " + dikdortgen.getPerimeter());
        System.out.println("dikdortgen.getArea() = " + dikdortgen.getArea());
    }
}
