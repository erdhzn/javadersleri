package Gun37.instanceModifiers.defaultModifier.same;

public class BookStore {
    public static void main(String[] args) {

        // ayni paketin icinde oldugundan
        // defaulta ulasabildik.
        Book kitap1 = new Book();
        kitap1.name = " Sefiller ";


        // zaten public oldugundan sinir yok
        Book kitap2 = new Book("Kar");


    }
}