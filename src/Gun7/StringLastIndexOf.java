package Gun7;

public class StringLastIndexOf {

    public static void main(String[] args) {
        // string icersinde aranan karakterlerin sondan itibaren ilk inderxini verir
        //indexof un sondan olna hali fakat index numaralarai degismez

        String text ="Good";
        System.out.println(" en sondaki o nun indexi ="+ text.lastIndexOf("o"));
        System.out.println("ilk bastan o nun indexi ="+ text.indexOf("o"));


        String text2= "Merhaba Arkadaslar";
        System.out.println("en sondaki a nun indexi = "+ text2.lastIndexOf("a"));
        System.out.println("en sondaki a nun indexi = "+ text2.indexOf("a"));

    }
}
