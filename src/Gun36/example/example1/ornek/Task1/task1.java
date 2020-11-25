package Gun36.example.example1.ornek.Task1;

public class task1 {

    //Ayri bir Book clasi i yaziniz fields, name , publishYear,autor
    // 3 adet consructor ekleyiniz
    // kitapaklrin ozellilerinin tek bir satirda yazdiran bir metod ekleyiniz.
    // 3 adet kitabi farkli constructor olusurup , mainde yazdirniz .
    public static void main(String[] args) {


        Book book1= new Book("Kasagi", 1925, "Omer Seyfettin");
        Book book2= new Book("Kavgam", 1945);
        Book book3= new Book();

        book1.ShowInfo();
        book2.ShowInfo();
        book3.ShowInfo();

//        int sayi=5;
//        System.out.println(sayi);// toString yapiyor

        System.out.println(book1);// book sayfasindan bunun hakkinda boilgileri alip
        // buraya getiriyor .****** ile belirtili
        System.out.println("book2.name = " + book2.name);

    }


}
